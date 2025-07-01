package com.rest.services;

import org.springframework.stereotype.Service;

@Service
public class DataService {
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
