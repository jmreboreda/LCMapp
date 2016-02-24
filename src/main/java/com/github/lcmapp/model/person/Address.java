/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.person;

/**
 *
 * @author jmrb
 */

public class Address {
    
    private String streetNumberFloor;
    private Integer location;
    private Integer postalCode;
    private Integer province;
    
    public Address(String streetNumberFloor, Integer location, Integer postalCode, Integer province) {
        this.streetNumberFloor = streetNumberFloor;
        this.location = location;
        this.postalCode = postalCode;
        this.province = province;
    }

    public String getStreetNumberFloor() {
        return streetNumberFloor;
    }

    public void setStreetNumberFloor(String streetNumberFloor) {
        this.streetNumberFloor = streetNumberFloor;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }
}
