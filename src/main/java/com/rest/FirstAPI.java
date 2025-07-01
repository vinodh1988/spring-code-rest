package com.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Person;
import com.rest.services.DataService;

@RestController
@RequestMapping("/api/v1/people")
public class FirstAPI {
 @Autowired
 private DataService dataService;
	@GetMapping("")
	public List<Person> getPeople() {
		return dataService.getPersons();
	}
	
	@PostMapping("")
	public ResponseEntity<Person> addPerson(@RequestBody Person person) {
		 dataService.addPerson(person);
		 return new ResponseEntity<>(person, HttpStatus.CREATED);
	}
}
