/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.contractchange;

import com.github.lcmapp.model.dao.GenericDAO;
import com.github.lcmapp.model.exceptions.InstanceNotFoundException;
import java.util.List;

/**
 *
 * @author jmrb
 */
public interface ContractChangeDAO extends GenericDAO<ContractChangeVO, Long> {

    void create(ContractChangeVO contractchangeVO);
    
    ContractChangeVO findContractChangeByNumber(Long number) throws InstanceNotFoundException;
        
    List<ContractChangeVO> findAllContractChanges() throws InstanceNotFoundException;
	
}
