package com.solera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.solera.entities.Person;
import com.solera.service.PersonaService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private PersonaService ps;
	
	@GetMapping("/people")
	public String getListOfPeople(Model model) {
		Person person = new Person();
		List<Person> people = ps.findAll();
		model.addAttribute("people", people);		
		model.addAttribute(person);
		return "people";
		
	}
	
	@PostMapping("/save")
	public String saveNewPerson(Person person) {
		ps.save(person);		
		return "redirect:/people";
	}
}
