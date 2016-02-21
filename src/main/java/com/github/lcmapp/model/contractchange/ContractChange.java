/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.contractchange;

import com.github.lcmapp.model.BusinessObject;
import java.util.Date;

/**
 *
 * @author jmrb
 */
public class ContractChange implements BusinessObject{

    private static final long serialVersionUID = 6546907566777253883L;
    
    private Long id;    
    private Long contractid;
    private Date datechange;
    private String contractfieldname;
    private String newvalue;
    private String oldvalue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContractid() {
        return contractid;
    }

    public void setContractid(Long contractid) {
        this.contractid = contractid;
    }

    public Date getDatechange() {
        return datechange;
    }

    public void setDatechange(Date datechange) {
        this.datechange = datechange;
    }

    public String getContractfieldname() {
        return contractfieldname;
    }

    public void setContractfieldname(String contractfieldname) {
        this.contractfieldname = contractfieldname;
    }

    public String getNewvalue() {
        return newvalue;
    }

    public void setNewvalue(String newvalue) {
        this.newvalue = newvalue;
    }

    public String getOldvalue() {
        return oldvalue;
    }

    public void setOldvalue(String oldvalue) {
        this.oldvalue = oldvalue;
    }
}
