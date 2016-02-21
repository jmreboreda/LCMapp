/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.studies;

import com.github.lcmapp.model.dao.GenericDAO;
import com.github.lcmapp.model.exceptions.InstanceNotFoundException;
import java.util.List;

/**
 *
 * @author jmrb
 */
public interface StudiesDAO extends GenericDAO<StudiesVO, Integer> {

    void create(StudiesVO studiesVO);
    
    StudiesVO findStudiesByNumber(Integer number) throws InstanceNotFoundException;
        
    List<StudiesVO> findAllStudies() throws InstanceNotFoundException;
	
}
