package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rest.services.DataService;
import com.rest.utilities.ApplicationState;
import com.rest.utilities.SessionState;

@Controller
@RequestMapping("/web")
public class FirstController {
	@Autowired
	DataService dataService;
	
	@Autowired
	SessionState sessionState;
	@Autowired
	ApplicationState applicationState;
@RequestMapping("/greet")
public String greet(ModelMap map) {
    map.addAttribute("names", dataService.geNames());
    sessionState.setState();
    applicationState.setState();
    map.addAttribute("svalue", sessionState.getState());
    map.addAttribute("avalue", applicationState.getState());
	return "home"; // Ensure you have a greet.html file in your templates directory
  }
}
