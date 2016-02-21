/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.contracttype;

import com.github.lcmapp.model.dao.GenericDAO;
import com.github.lcmapp.model.exceptions.InstanceNotFoundException;
import java.util.List;

/**
 *
 * @author jmrb
 */
public interface ContractTypeDAO extends GenericDAO<ContractTypeVO, Long> {

	ContractTypeVO findContractTypeByNumber(Long number) throws InstanceNotFoundException;
        
        List<ContractTypeVO> findAllContractTypes() throws InstanceNotFoundException;
	
}
