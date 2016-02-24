package com.github.lcmapp.principal;

import com.github.lcmapp.model.mappers.PersonMapper;
import com.github.lcmapp.model.person.Person;
import com.github.lcmapp.model.person.PersonDao;
import com.github.lcmapp.model.person.PersonVO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.CollectionUtils;

/**
 *
 * @author jmrb
 */
public class LCMapp {
        
    public static void main (String args[]){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    	PersonDao personDao = (PersonDao) context.getBean("personDao");
    
    	// Aquí empieza el código que haría tu Manager
    	
    	List<PersonVO> personsVO = personDao.findAllPersons();
    	
        List<Person> persons = new ArrayList<>();
        for(PersonVO personVO : personsVO) {
        	persons.add(PersonMapper.proccessVOBO(personVO));
        }

        // Aquí terminaría el Manager y devolvería el objeto persons
        
        if(CollectionUtils.isEmpty(persons) == false) {
	        for(Person person : persons) {
	        	System.out.println(person.toString());
	        }
        }
        else {
        	System.out.println("No hay personas");
        }
                
    }

}