/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.studies;

import com.github.lcmapp.model.BusinessObject;

/**
 *
 * @author jmrb
 */
public class Studies implements BusinessObject{

    private static final long serialVersionUID = 5841389432767750431L;
    
    private Integer id;
    private Integer studiesid;
    private String studiesname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudiesid() {
        return studiesid;
    }

    public void setStudiesid(Integer studiesid) {
        this.studiesid = studiesid;
    }

    public String getStudiesname() {
        return studiesname;
    }

    public void setStudiesname(String studiesname) {
        this.studiesname = studiesname;
    }    
}
