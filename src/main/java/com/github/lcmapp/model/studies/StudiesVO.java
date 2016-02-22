/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.studies;

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
@Table(name = "studies")
public class StudiesVO implements ValueObject {

    private static final long serialVersionUID = -614152286540813872L;

    private Integer id;
    private Integer studiesid;
    private String studiesname;

    public StudiesVO() {
    }

    @Id
    @SequenceGenerator(name="StudiesIdGenerator", sequenceName="StudiesIdSequence")
    @GeneratedValue(strategy=GenerationType.AUTO, generator="StudiesIdGenerator")
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
