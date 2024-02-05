package com.ibm.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.person.entity.PersonEntity;
import com.ibm.person.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	
	@GetMapping("/person")
	List<PersonEntity> findAll()
	{
		return personService.findAll();
		
	}
	
	@GetMapping("/person/{id}")
	PersonEntity findById(@PathVariable int id)
	{
		return personService.findById(id);
		
	}
	
	@PutMapping("/person")
	void update(@RequestBody PersonEntity Person)
	{
		personService.save(Person);
		
	}
	@PostMapping("/person")
	void save(@RequestBody PersonEntity Person)
	{
		personService.save(Person);
		
	}
	@DeleteMapping("/person/{id}")
	void deleteById(@PathVariable int id)
	{
		personService.deleteById(id);
		
	}
}
