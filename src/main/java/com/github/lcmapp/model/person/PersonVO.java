/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.person;

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
@Table(name = "person")
public class PersonVO implements ValueObject {

    private static final long serialVersionUID = 5361621336550354239L;

    private Long id;
    private String lastName;
    private String firstName;
    private Integer nifCif;
    private Integer nifCifdup;
    private Integer socSecnumber;
    private Date birthdate;
    private Integer civilStatus;
    private String address;
    private Integer studies;
    private Integer nacionality;

    public PersonVO() {
    }

    @Id
    @SequenceGenerator(name="PersonIdGenerator", sequenceName="PersonIdSequence")
    @GeneratedValue(strategy=GenerationType.AUTO, generator="PersonIdGenerator")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getNifCif() {
        return nifCif;
    }

    public void setNifCif(Integer nifCif) {
        this.nifCif = nifCif;
    }

    public Integer getNifCifdup() {
        return nifCifdup;
    }

    public void setNifCifdup(Integer nifCifdup) {
        this.nifCifdup = nifCifdup;
    }

    public Integer getSocSecNumber() {
        return socSecnumber;
    }

    public void setSocSecNumber(Integer ssNumber) {
        this.socSecnumber = ssNumber;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(Integer civilStatus) {
        this.civilStatus = civilStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStudies() {
        return studies;
    }

    public void setStudies(Integer studies) {
        this.studies = studies;
    }

    public Integer getNacionality() {
        return nacionality;
    }

    public void setNacionality(Integer nacionality) {
        this.nacionality = nacionality;
    }

    
}
