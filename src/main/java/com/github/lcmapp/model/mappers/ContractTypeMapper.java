/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.mappers;

import com.github.lcmapp.model.contracttype.ContractType;
import com.github.lcmapp.model.contracttype.ContractTypeVO;

public class ContractTypeMapper {

	public static ContractType proccessVOBO(ContractTypeVO contracttypeVO) {
		
		if(contracttypeVO == null) {
                    return null;
		}
		
		ContractType contracttype = new ContractType();
		
		contracttype.setId(contracttypeVO.getId());
                contracttype.setContracttypeid(contracttypeVO.getContracttypeid());
                contracttype.setContracttypename(contracttypeVO.getContracttypename());

		return contracttype;
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
