/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.dao;

import com.github.lcmapp.model.exceptions.InstanceNotFoundException;
import java.io.Serializable;

/**
 *
 * @author jmrb
 */

public interface GenericDAO <E, PK extends Serializable>{

    void create(E entity);
		
    E find(PK id) throws InstanceNotFoundException;
	
    boolean exists(PK id);
	
    E update(E entity);

    void remove(PK id) throws InstanceNotFoundException;	
    
}
