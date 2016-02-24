/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.person;

import com.github.lcmapp.model.BusinessObject;
import java.util.Date;

/**
 *
 * @author jmrb
 */
public class Person implements BusinessObject {

    private static final long serialVersionUID = 3443058171068955864L;
    
    private Long id;
    private String lastName;
    private String firstName;
    private Integer nifCif;
    private Integer nifCifdup;
    private Integer socSecNumber;
    private Date birthdate;
    private Integer civilStatus;
    private String address;
    private Integer studies;
    private Integer nacionality;

    
    public Person() {
    }


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
        return socSecNumber;
    }

    public void setSocSecNumber(Integer ssNumber) {
        this.socSecNumber = ssNumber;
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
    
    public String toString() {
    	return String.format("Person[ id=%s, name=%s, lastname=%s ]", this.id, this.firstName, this.lastName);
    }
}
