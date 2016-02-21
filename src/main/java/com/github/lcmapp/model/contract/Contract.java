/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.contract;

import com.github.lcmapp.model.BusinessObject;
import com.github.lcmapp.model.contractchange.ContractChange;
import com.github.lcmapp.model.contractchange.ContractChangeDaoHibernate;
import com.github.lcmapp.model.contractchange.ContractChangeVO;
import com.github.lcmapp.model.mappers.ContractChangeMapper;

/**
 *
 * @author jmrb
 */
public class Contract implements BusinessObject {
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Long contractnumber;
    private String clientgmname;

    
    public Contract() {
    }

    
    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    
    public Long getContractnumber() {
        return contractnumber;
    }

    
    public void setContractnumber(Long contractnumber) {
        this.contractnumber = contractnumber;
    }

    public String getClientgmname() {
        return clientgmname;
    }

    public void setClientgmname(String clientgmname) {
        this.clientgmname = clientgmname;
    }
    
    public void ContractChange(ContractChange contractchange){
        
        ContractChangeDaoHibernate contractchangeDAOhibernate = new ContractChangeDaoHibernate();
        ContractChangeVO contractchangeVO;
        
        contractchangeVO = ContractChangeMapper.proccessBOVO(contractchange);
        contractchangeDAOhibernate.create(contractchangeVO);
        
    }
    
}
