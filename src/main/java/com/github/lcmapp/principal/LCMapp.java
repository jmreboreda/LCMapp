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
import java.text.SimpleDateFormat;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author jmrb
 */
public class LCMapp {
    
    public static Session session;
    
    public static void main (String args[]){
        
        PersonList();
        
    }
    
    
    public static void PersonList(){
    
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            PersonDaoHibernate personDAOhibernate = new PersonDaoHibernate();
            List<Person> persons;
            PersonVO personVO;
            Person person;
            try{
                persons = personDAOhibernate.findAllPersons();
                if(persons.size() > 0){
                    for(Object tupla: persons){
                        personVO = (PersonVO) tupla;
                        person = (PersonMapper.proccessVOBO(personVO));
                        person.list();
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
}