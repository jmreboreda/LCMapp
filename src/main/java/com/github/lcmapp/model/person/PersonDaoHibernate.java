/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.person;

import com.github.lcmapp.model.dao.GenericDaoHibernate;
import com.github.lcmapp.model.exceptions.InstanceNotFoundException;
import com.github.lcmapp.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class PersonDaoHibernate extends GenericDaoHibernate<PersonVO,Long> implements PersonDAO {
	
	private SessionFactory sessionFactory;
        
	public PersonVO findPersonByName(String name) throws InstanceNotFoundException {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("select p from PersonVO p where p.name=:name");
		query.setParameter("name", name);
		
		PersonVO person = (PersonVO) query.uniqueResult();
		
		if(person == null) {
			throw new InstanceNotFoundException(name, PersonVO.class.getSimpleName());
		}
		
		return person;
	}

    @Override
    public PersonVO findPersonByNumber(Long number) throws InstanceNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PersonVO> findAllPersons() throws InstanceNotFoundException {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        //Session session = sessionFactory.getCurrentSession();
		
        Query query = session.createQuery("from PersonVO");

        @SuppressWarnings("unchecked")
        List<PersonVO> personsVO = (List<PersonVO>) query.list();

        return personsVO;
    }
}
