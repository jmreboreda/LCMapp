/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.principal;

import com.github.lcmapp.contract.ContractVO;
import com.github.lcmapp.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author jmrb
 */
public class LCMapp {
    
    public static void main (String args[]){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (session != null){
            System.out.println("Habemus session!!!\n");
             
            String hql = "FROM com.github.lcmapp.contract.ContractVO";
            Query query = session.createQuery(hql);
            List results = query.list();
            ContractVO contractVO;
            for(Object item: results){
                contractVO = (ContractVO) item;
                System.out.println("Resultado: " + contractVO.getContractNumber());
            }
            HibernateUtil.getSessionFactory().close();
        }
    }
}
