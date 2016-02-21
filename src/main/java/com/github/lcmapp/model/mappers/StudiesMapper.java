/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.mappers;

import com.github.lcmapp.model.studies.Studies;
import com.github.lcmapp.model.studies.StudiesVO;

public class StudiesMapper {

	public static Studies proccessVOBO(StudiesVO studiesVO) {
		
		if(studiesVO == null) {
                    return null;
		}
		
		Studies studies = new Studies();
		
		studies.setId(studiesVO.getId());
                studies.setStudiesid(studiesVO.getStudiesid());
                studies.setStudiesname(studiesVO.getStudiesname());

		return studies;
	}
	
	public static StudiesVO proccessBOVO(Studies studies) {
		
		if(studies == null) {
                    return null;
		}
		
		StudiesVO studiesVO = new StudiesVO();

		studiesVO.setId(studies.getId());
                studiesVO.setStudiesid(studies.getStudiesid());
                studiesVO.setStudiesname(studies.getStudiesname());
		
		return studiesVO;
	}
}
