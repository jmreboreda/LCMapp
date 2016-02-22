/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.person;

import com.github.lcmapp.model.dao.GenericDAO;
import com.github.lcmapp.model.exceptions.InstanceNotFoundException;
import java.util.List;

/**
 *
 * @author jmrb
 */
public interface PersonDao extends GenericDAO<PersonVO, Long> {

    void create(PersonVO personVO);
    
    PersonVO findPersonByName(String name) throws InstanceNotFoundException;
    
    List<Person> findAllPersons() throws InstanceNotFoundException;
        
}
