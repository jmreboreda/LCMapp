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
		person.setName(personVO.getName());
		
		return person;
	}
	
	public static PersonVO proccessBOVO(Person person) {
		
		if(person == null) {
			return null;
		}
		
		PersonVO personVO = new PersonVO();

		personVO.setId(person.getId());
		personVO.setName(person.getName());
		
		return personVO;
	}
}
