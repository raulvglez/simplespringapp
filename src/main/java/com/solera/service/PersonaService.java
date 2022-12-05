package com.solera.service;

import java.util.List;

import com.solera.entities.Person;

public interface PersonaService {
	
	public List<Person> findAll();
	public Person findById(int id);
	public Person save(Person person);
	void deleteById(Person person);
}
