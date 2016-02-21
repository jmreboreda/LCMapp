/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.mappers;

import com.github.lcmapp.model.contractchange.ContractChange;
import com.github.lcmapp.model.contractchange.ContractChangeVO;
import com.github.lcmapp.model.contracttype.ContractType;
import com.github.lcmapp.model.contracttype.ContractTypeVO;

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
	
	public static ContractTypeVO proccessBOVO(ContractType contracttype) {
		
		if(contracttype == null) {
                    return null;
		}
		
		ContractTypeVO contracttypeVO = new ContractTypeVO();

		contracttypeVO.setId(contracttype.getId());
                contracttypeVO.setContracttypeid(contracttype.getContracttypeid());
                contracttypeVO.setContracttypename(contracttype.getContracttypename());
		
		return contracttypeVO;
	}
}
