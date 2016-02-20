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
                person.setPersonid(personVO.getPersonid());
                person.setLastname(personVO.getLastname());
		person.setName(personVO.getName());
                person.setNifcif(personVO.getNifcif());
                person.setNifcifdup(personVO.getNifcifdup());   
                person.setInss(personVO.getInss());
                person.setBirthdate(personVO.getBirthdate());
                person.setCivilstatus(personVO.getCivilstatus());
                person.setAddress(personVO.getAddress());
                person.setLocation(personVO.getLocation());
                person.setPostalcode(personVO.getPostalcode());
//                person.setStudies(personVO.getStudies());
                person.setNacionality(personVO.getNacionality());
		
		return person;
	}
	
	public static PersonVO proccessBOVO(Person person) {
		
		if(person == null) {
			return null;
		}
		
		PersonVO personVO = new PersonVO();

		personVO.setId(person.getId());
                personVO.setPersonid(person.getPersonid());
                personVO.setLastname(person.getLastname());
		personVO.setName(person.getName());
                personVO.setNifcif(person.getNifcif());
                personVO.setNifcifdup(person.getNifcifdup());   
                personVO.setInss(person.getInss());
                personVO.setBirthdate(person.getBirthdate());
                personVO.setCivilstatus(person.getCivilstatus());
                personVO.setAddress(person.getAddress());
                personVO.setLocation(person.getLocation());
                personVO.setPostalcode(person.getPostalcode());
//                personVO.setStudies(person.getStudies());
                personVO.setNacionality(person.getNacionality());
		
		return personVO;
	}
}
