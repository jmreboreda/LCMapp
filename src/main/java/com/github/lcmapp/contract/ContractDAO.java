/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.contract;

import com.github.lcmapp.model.dao.GenericDAO;
import com.github.lcmapp.model.exceptions.InstanceNotFoundException;

/**
 *
 * @author jmrb
 */
public interface ContractDAO extends GenericDAO<ContractVO,Long> {

	ContractVO findContractByNumber(Long number) throws InstanceNotFoundException;	
	
}
