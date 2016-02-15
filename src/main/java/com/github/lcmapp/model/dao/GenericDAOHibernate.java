/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.dao;

import com.github.lcmapp.model.exceptions.InstanceNotFoundException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author jmrb
 */
public class GenericDAOHibernate<E, PK extends Serializable> implements GenericDAO<E, PK> {

	private SessionFactory sessionFactory;
	private Class<E> entityClass;

	@SuppressWarnings("unchecked")
	public GenericDAOHibernate() {
            this.entityClass = (Class<E>) ((ParameterizedType) getClass().
			getGenericSuperclass()).getActualTypeArguments()[0];		
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
            this.sessionFactory = sessionFactory;
	}
	
	protected Session getSession() {
            return sessionFactory.getCurrentSession();
	}

        @Override
	public void create(E entity) {
            getSession().persist(entity);
	}

        @Override
	public boolean exists(PK id) {

            return getSession().createCriteria(entityClass).
		add(Restrictions.idEq(id)).
		setProjection(Projections.id()).
                uniqueResult() != null;

	}

	@SuppressWarnings("unchecked")
        @Override
	public E find(PK id) throws InstanceNotFoundException {

            E entity = (E) getSession().get(entityClass, id);

            if (entity == null) {
                throw new InstanceNotFoundException(id, entityClass.getName());
            }

            return entity;

	}

        @Override
	public void remove(PK id) throws InstanceNotFoundException {
            getSession().delete(find(id));
	}

	@SuppressWarnings("unchecked")
        @Override
	public E update(E entity) {
            return (E) getSession().merge(entity);
	}

}
