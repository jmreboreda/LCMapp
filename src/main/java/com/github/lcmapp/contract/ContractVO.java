/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.contract;

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
@Table(name = "Contract")
public class ContractVO implements ValueObject {

	private static final long serialVersionUID = 8674188501454422360L;
	
	private Long id;
	private Long contractnumber;
	
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

	public Long getContractNumber() {
		return contractnumber;
	}

	public void setContracNumber(Long contractnumber) {
		this.contractnumber = contractnumber;
	}
}
