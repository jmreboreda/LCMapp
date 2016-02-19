/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.person;

import com.github.lcmapp.model.dao.GenericDAO;
import com.github.lcmapp.model.exceptions.InstanceNotFoundException;

/**
 *
 * @author jmrb
 */
public interface PersonDAO extends GenericDAO<PersonVO, Long> {

    PersonVO findPersonByNumber(Long number) throws InstanceNotFoundException;
        
}
