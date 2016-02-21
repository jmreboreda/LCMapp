/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.contractchange;

import com.github.lcmapp.model.ValueObject;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author jmrb
 */
@Entity
@Table(name = "contractchange")
public class ContractChangeVO implements ValueObject {

    private static final long serialVersionUID = 500827709601921315L;

    private Long id;    
    private Long contractid;
    private Date datechange;
    private String contractfieldname;
    private String newvalue;
    private String oldvalue;

    public ContractChangeVO() {
    }

    @Id
    @SequenceGenerator(name="ContractChangeIdGenerator", sequenceName="ContractChangeIdSequence")
    @GeneratedValue(strategy=GenerationType.AUTO, generator="ContractChangeIdGenerator")
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
