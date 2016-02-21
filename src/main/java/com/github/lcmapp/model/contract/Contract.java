/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.contract;

import com.github.lcmapp.model.BusinessObject;

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
    
}