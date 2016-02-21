/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.mappers;

import com.github.lcmapp.model.contractchange.ContractChange;
import com.github.lcmapp.model.contractchange.ContractChangeVO;

public class ContractChangeMapper {

	public static ContractChange proccessVOBO(ContractChangeVO contractchangeVO) {
		
		if(contractchangeVO == null) {
                    return null;
		}
		
		ContractChange contractchange = new ContractChange();
		
		contractchange.setId(contractchangeVO.getId());
                contractchange.setContractid(contractchangeVO.getContractid());
                contractchange.setDatechange(contractchangeVO.getDatechange());
                contractchange.setContractfieldname(contractchangeVO.getContractfieldname());
                contractchange.setNewvalue(contractchangeVO.getNewvalue());
                contractchange.setOldvalue(contractchangeVO.getOldvalue());
                
		return contractchange;
	}
	
	public static ContractChangeVO proccessBOVO(ContractChange contractchange) {
		
		if(contractchange == null) {
                    return null;
		}
		
		ContractChangeVO contractchangeVO = new ContractChangeVO();

		contractchangeVO.setId(contractchange.getId());
                contractchangeVO.setContractid(contractchange.getContractid());
                contractchangeVO.setDatechange(contractchange.getDatechange());
                contractchangeVO.setContractfieldname(contractchange.getContractfieldname());
                contractchangeVO.setNewvalue(contractchange.getNewvalue());
                contractchangeVO.setOldvalue(contractchange.getOldvalue());

		return contractchangeVO;
	}
}
