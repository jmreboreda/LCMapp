/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.contract;

import com.github.lcmapp.model.dao.GenericDaoHibernate;
import com.github.lcmapp.model.exceptions.InstanceNotFoundException;
import com.github.lcmapp.model.person.*;
import com.github.lcmapp.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class ContractDaoHibernate extends GenericDaoHibernate<ContractVO, Long> implements ContractDAO {
	

	private SessionFactory sessionFactory;
        
	public ContractVO findContractByName(String name) throws InstanceNotFoundException {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("select p from ContractVO p where p.name=:name");
		query.setParameter("name", name);
		
		ContractVO change = (ContractVO) query.uniqueResult();
		
		if(change == null) {
			throw new InstanceNotFoundException(name, PersonVO.class.getSimpleName());
		}
		
		return change;
	}

    @Override
    public ContractVO findContractByNumber(Long number) throws InstanceNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ContractVO> findAllContracts() throws InstanceNotFoundException {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        //Session session = sessionFactory.getCurrentSession();
		
        Query query = session.createQuery("from ContractVO");

        @SuppressWarnings("unchecked")
        List<ContractVO> contractVO = (List<ContractVO>) query.list();

        return contractVO;
    }

}
