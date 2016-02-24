/*
 * RBJM
 * Aplicación desarrollada por José M. Reboreda Barcia
 * para uso propio en Gestoría MOLDES.
 */
package com.github.lcmapp.model.mappers;

import com.github.lcmapp.model.person.Person;
import com.github.lcmapp.model.person.PersonVO;

public class PersonMapper {

	public static Person proccessVOBO(PersonVO personVO) {
		
		if(personVO == null) {
                    return null;
		}
		
		Person person = new Person();
		
		person.setId(personVO.getId());
                person.setLastName(personVO.getLastName());
		person.setFirstName(personVO.getFirstName());
                person.setNifCif(personVO.getNifCif());
                person.setNifCifdup(personVO.getNifCifdup());   
                person.setSocSecNumber(personVO.getSocSecNumber());
                person.setBirthdate(personVO.getBirthdate());
                person.setCivilStatus(personVO.getCivilStatus());
                person.setAddress(personVO.getAddress());
                person.setStudies(personVO.getStudies());
                person.setNacionality(personVO.getNacionality());
		
		return person;
	}
	
	public static PersonVO proccessBOVO(Person person) {
		
		if(person == null) {
                    return null;
		}
		
		PersonVO personVO = new PersonVO();

		personVO.setId(person.getId());
                personVO.setLastName(person.getLastName());
		personVO.setFirstName(person.getFirstName());
                personVO.setNifCif(person.getNifCif());
                personVO.setNifCifdup(person.getNifCifdup());   
                personVO.setSocSecNumber(person.getSocSecNumber());
                personVO.setBirthdate(person.getBirthdate());
                personVO.setCivilStatus(person.getCivilStatus());
                personVO.setAddress(person.getAddress());
                personVO.setStudies(person.getStudies());
                personVO.setNacionality(person.getNacionality());
		
		return personVO;
	}
}
