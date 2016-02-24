/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.manager;

import com.github.lcmapp.model.mappers.PersonMapper;
import com.github.lcmapp.model.person.Person;
import com.github.lcmapp.model.person.PersonDao;
import com.github.lcmapp.model.person.PersonVO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jmrb
 */
@Service
@Transactional
public class PersonsManager {
    
    @Autowired
    private PersonDao personDao;
    
    public List<Person> findAllPersons(){
        List<PersonVO> personsVO = personDao.findAllPersons();
    	
        List<Person> persons = new ArrayList<>();
        for(PersonVO personVO : personsVO) {
        	persons.add(PersonMapper.proccessVOBO(personVO));
        }
        
        return persons;
    } 
}
