package com.rest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Person;
import com.rest.services.DataService;
import com.rest.utilities.MessageSender;

@RestController
@RequestMapping("/api/v1/people")
public class FirstAPI {
 @Autowired
 private DataService dataService;
 
 @Autowired
 private MessageSender messageSender;
 Logger logger = LoggerFactory.getLogger(FirstAPI.class);
	@GetMapping("")
	public List<Person> getPeople() {
		logger.info("Persons API called to fetch all persons");
		return dataService.getPersons();
	}
	
	@GetMapping("/{sno}")
	public Person getPeople(@PathVariable Integer sno) {
		logger.info("Persons API called to fetch all persons");
		return dataService.getPersonBySno(sno);
	}
	
	
	@PostMapping("")
	public ResponseEntity<Person> addPerson(@RequestBody Person person) {
		 dataService.addPerson(person);
		 messageSender.send("Person added: " + person.getSno());
		 return new ResponseEntity<>(person, HttpStatus.CREATED);
	}
}
