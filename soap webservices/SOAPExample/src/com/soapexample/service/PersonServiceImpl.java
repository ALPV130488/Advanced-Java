package com.soapexample.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.soapexample.beans.Person;

public class PersonServiceImpl implements PersonService {

	private static Map<Integer,Person> persons = new HashMap<Integer,Person>();
	
	public boolean addPerson(Person p) {
		if(persons.get(p.getId()) != null) return false;
		persons.put(p.getId(), p);
		return true;
	}

	public boolean deletePerson(int id) {
		if(persons.get(id) == null) return false;
		persons.remove(id);
		return true;
	}

	public Person getPerson(int id) {
		return persons.get(id);
	}

	public Person[] getAllPersons() {
		Set<Integer> ids = persons.keySet();
		Person[] p = new Person[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = persons.get(id);
			i++;
		}
		return p;
	}

}