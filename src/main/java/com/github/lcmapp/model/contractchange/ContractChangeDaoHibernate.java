/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.contractchange;

import com.github.lcmapp.model.dao.GenericDaoHibernate;
import com.github.lcmapp.model.exceptions.InstanceNotFoundException;
import com.github.lcmapp.model.person.*;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class ContractChangeDaoHibernate extends GenericDaoHibernate<ContractChangeVO, Long> implements ContractChangeDAO {
	

	private SessionFactory sessionFactory;
        
        public void create(ContractChangeVO contractchangeVO){
        
        Session session = sessionFactory.getCurrentSession();
        
        session.beginTransaction();
        session.save(contractchangeVO);
        
        session.getTransaction().commit();
        
    }
        
	public ContractChangeVO findContractChangeByName(String name) throws InstanceNotFoundException {
		
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("select p from ContractChangeVO p where p.name=:name");
        query.setParameter("name", name);

        ContractChangeVO change = (ContractChangeVO) query.uniqueResult();

        if(change == null) {
                throw new InstanceNotFoundException(name, PersonVO.class.getSimpleName());
        }

        return change;
        }

    @Override
    public ContractChangeVO findContractChangeByNumber(Long number) throws InstanceNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ContractChangeVO> findAllContractChanges() throws InstanceNotFoundException {
        
        Session session = sessionFactory.getCurrentSession();
		
        Query query = session.createQuery("from ContractTypeVO");

        @SuppressWarnings("unchecked")
        List<ContractChangeVO> contractchangeVO = (List<ContractChangeVO>) query.list();

        return contractchangeVO;
    }

}
