/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.principal;

import com.github.lcmapp.model.contract.Contract;
import com.github.lcmapp.model.contractchange.ContractChange;
import com.github.lcmapp.model.contractchange.ContractChangeVO;
import com.github.lcmapp.model.mappers.ContractChangeMapper;
import com.github.lcmapp.model.mappers.PersonMapper;
import com.github.lcmapp.model.person.Person;
import com.github.lcmapp.model.person.PersonDaoHibernate;
import com.github.lcmapp.model.person.PersonVO;
import com.github.lcmapp.utils.HibernateUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author jmrb
 */
public class LCMapp {
    
    public static Session session;
    
    public static void main (String args[]){
        
        session = HibernateUtil.getSessionFactory().openSession();
        if (session != null)
            System.out.println("Habemus session!!!\n");

        PersonList();
        ContractChange();
        
        HibernateUtil.getSessionFactory().close();
    }
    
    
    public static void PersonList(){
    
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            PersonDaoHibernate personDAOhibernate = new PersonDaoHibernate();
            List<PersonVO> personsVO;
            PersonVO personVO;
            Person person;
            try{
                personsVO = personDAOhibernate.findAllPersons();
                if(personsVO.size() > 0){
                    for(Object tupla: personsVO){
                        personVO = (PersonVO) tupla;
                        person = (PersonMapper.proccessVOBO(personVO));
                        
                        System.out.println("[" + person.getId() + "] " + person.getLastname()+ ", " + person.getName() + " nacido el "
                        + formatter.format(person.getBirthdate()));
                    }
                }
                else
                {
                    System.out.println("No se han encontrado personas");
                }
            }
            catch (Exception InstanceNotFoundException){ 
                InstanceNotFoundException.printStackTrace();
            }
        }
    
    
    public static void ContractChange(){
        
            ContractChange contractchange;
            ContractChangeVO contractchangeVO = new ContractChangeVO();
            
            contractchangeVO.setContractid(123456L);
            Date fecha = new Date();
            contractchangeVO.setDatechange(fecha);
            
            contractchange = ContractChangeMapper.proccessVOBO(contractchangeVO);
            
            Contract contract = new Contract();
            contract.ContractChange(contractchange);
    }
}

        