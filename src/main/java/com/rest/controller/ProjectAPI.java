package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Project;
import com.rest.services.ProjectService;

@RestController
@RequestMapping("/api/v1/projects")
public class ProjectAPI {

	@Autowired
	private ProjectService projectService;	
	
	@GetMapping("")
	public List<Project> getAllProjects() {
		return projectService.getAllProjects();
	}
	
}
