package com.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Project;
import com.rest.repository.ProjectRepository;

@Service
public class ProjectService {
@Autowired
private ProjectRepository projectRepository;

public List<Project> getAllProjects() {
	return projectRepository.findAll();

   }


public void addProject(Project project) {
	  projectRepository.save(project);// it works for both insert and update operations
   }

}
