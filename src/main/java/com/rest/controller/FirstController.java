package com.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class FirstController {
@RequestMapping("/greet")
public String greet() {
	// This method will resolve to greet.html in the templates directory
	return "home"; // Ensure you have a greet.html file in your templates directory
  }
}
