/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.contract;

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
@Table(name = "contract")
public class ContractVO implements ValueObject {

    private static final long serialVersionUID = 3109223430632068441L;
    
    private Long id;
    private Long contractnumber;
    private String clientgmname;

    public ContractVO() {
    }

    @Id
    @SequenceGenerator(name="ContractIdGenerator", sequenceName="ContractIdSequence")
    @GeneratedValue(strategy=GenerationType.AUTO, generator="ContractIdGenerator")
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
