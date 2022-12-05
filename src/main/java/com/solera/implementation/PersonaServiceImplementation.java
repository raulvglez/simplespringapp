package com.solera.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solera.entities.Person;
import com.solera.repository.PersonRepository;
import com.solera.service.PersonaService;

@Service
public class PersonaServiceImplementation implements PersonaService{
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Person> findAll() {
		return personRepository.findAll();
	}

	@Override
	public Person findById(int id) {
		return personRepository.findById(id).get();
	}

	@Override
	public Person save(Person person) {
		return personRepository.save(person);
	}

	@Override
	public void deleteById(Person person) {
		personRepository.delete(person);
	}

}
