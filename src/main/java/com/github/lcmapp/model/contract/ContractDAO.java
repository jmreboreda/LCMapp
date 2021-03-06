/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.contract;

import com.github.lcmapp.model.dao.GenericDAO;
import com.github.lcmapp.model.exceptions.InstanceNotFoundException;
import java.util.List;

/**
 *
 * @author jmrb
 */
public interface ContractDAO extends GenericDAO<ContractVO, Long> {

	ContractVO findContractByNumber(Long number) throws InstanceNotFoundException;	
        
        List<ContractVO> findAllContracts() throws InstanceNotFoundException;
	
}
