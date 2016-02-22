/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.mappers;

import com.github.lcmapp.model.contract.Contract;
import com.github.lcmapp.model.contract.ContractVO;

public class ContractMapper {

	public static Contract proccessVOBO(ContractVO contractVO) {
		
		if(contractVO == null) {
                    return null;
		}
		
		Contract contract = new Contract();
		
		contract.setId(contractVO.getId());
                contract.setContractnumber(contractVO.getContractnumber());
                contract.setClientgmname(contractVO.getClientgmname());

		return contract;
	}
	
	public static ContractVO proccessBOVO(Contract contract) {
		
		if(contract == null) {
                    return null;
		}
		
		ContractVO contractVO = new ContractVO();

		contractVO.setId(contract.getId());
                contractVO.setContractnumber(contract.getContractnumber());
                contractVO.setClientgmname(contract.getClientgmname());
		
		return contractVO;
	}
}
