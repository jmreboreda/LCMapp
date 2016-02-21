/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.contracttype;

import com.github.lcmapp.model.BusinessObject;

/**
 *
 * @author jmrb
 */
public class ContractType implements BusinessObject{

    private static final long serialVersionUID = 405138374155393668L;
    
    private Long id;
    private Long contracttypeid;
    private String contracttypename;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContracttypeid() {
        return contracttypeid;
    }

    public void setContracttypeid(Long contracttypeid) {
        this.contracttypeid = contracttypeid;
    }

    public String getContracttypename() {
        return contracttypename;
    }

    public void setContracttypename(String contracttypename) {
        this.contracttypename = contracttypename;
    }

    
}
