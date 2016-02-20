/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.principal;

import com.github.lcmapp.model.mappers.PersonMapper;
import com.github.lcmapp.model.person.Person;
import com.github.lcmapp.model.person.PersonDaoHibernate;
import com.github.lcmapp.model.person.PersonVO;
import com.github.lcmapp.utils.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
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
             
//            String hql = "from ContractVO";
//            Query query = session.createQuery(hql);
//            List results = query.list();
//            ContractVO contractVO;
//            int counter = 1;
//            for(Object tupla: results){
//                contractVO = (ContractVO) tupla;
//                System.out.println("Resultado " + counter + ": [Id: " + contractVO.getId() + "] [Número contrato: "
//                        + contractVO.getContractnumber() + "] [Cliente GM: " + contractVO.getClientgmname() + "]");
//                counter++;
//            }
            
            PersonDaoHibernate personDAO = new PersonDaoHibernate();
            List<PersonVO> personsVO =new ArrayList();
            PersonVO personVO = new PersonVO();
            Person person = new Person();
            try{
                personsVO = personDAO.findAllPersons();
                if(personsVO.size() > 0){
                    for(Object tupla: personsVO){
                        personVO = (PersonVO) tupla;
                        person = (PersonMapper.proccessVOBO(personVO));
                        System.out.println(person.getLastname());
                    }
                }
            }
            catch (Exception InstanceNotFoundException){   
            }
            HibernateUtil.getSessionFactory().close();
        }
    }
}
