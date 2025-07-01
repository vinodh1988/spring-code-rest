package com.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.entity.Person;

@Service
public class DataService {
List<Person> persons = new ArrayList<>();

   {
	  persons.add(new Person(1, "John", "New York"));
	  persons.add(new Person(2, "Jane", "Los Angeles"));
	  persons.add(new Person(3, "Doe", "Chicago"));
	  persons.add(new Person(4, "Smith", "Houston"));
	  persons.add(new Person(5, "Emily", "Phoenix"));
	  persons.add(new Person(6, "Michael", "Philadelphia"));
	  persons.add(new Person(7, "Sarah", "San Antonio"));
	  persons.add(new Person(8, "David", "San Diego"));
	  persons.add(new Person(9, "Laura", "Dallas"));
	  persons.add(new Person(10, "James", "New york"));
   }

   public List<Person> getPersons() {
	  return persons;
   }
   
   public void addPerson(Person person) {
	   persons.add(person);
   }
 public String[] geNames() {
   return new String[] { 
	 "John Doe", 
	 "Jane Smith", 
	 "Alice Johnson", 
	 "Bob Brown", 
	 "Charlie White" 
   };
 }
}
