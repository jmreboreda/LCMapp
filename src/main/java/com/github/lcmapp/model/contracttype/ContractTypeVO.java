/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.contracttype;

import com.github.lcmapp.model.ValueObject;
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
@Table(name = "contracttype")
public class ContractTypeVO implements ValueObject {

    private static final long serialVersionUID = 2272554980280390934L;
    
    private Long id;
    private Long contracttypeid;
    private String contracttypename;

    public ContractTypeVO() {
    }

    @Id
    @SequenceGenerator(name="ContractTypeIdGenerator", sequenceName="ContractTypeIdSequence")
    @GeneratedValue(strategy=GenerationType.AUTO, generator="ContractTypeIdGenerator")
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
