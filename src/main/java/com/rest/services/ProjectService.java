package com.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Project;
import com.rest.repository.ProjectRepository;
import com.rest.utilities.RecordAlreadyExistsException;
import com.rest.utilities.RecordNotFoundException;

@Service
public class ProjectService {
@Autowired
private ProjectRepository projectRepository;

public List<Project> getAllProjects() {
	return projectRepository.findAll();

   }


public void addProject(Project project) throws RecordAlreadyExistsException {
	    Project p = projectRepository.findByPno(project.getPno());
	    if(p != null) 
	    	throw new RecordAlreadyExistsException();
	  projectRepository.save(project);// it works for both insert and update operations
   }

public Project getProjectByPno(int pno) throws RecordNotFoundException {
	Project p = projectRepository.findByPno(pno);
	if(p == null)
		throw new RecordNotFoundException();
		return p;
   }

public void deleteProject(int pno) throws RecordNotFoundException {
	Project p = projectRepository.findByPno(pno);
	if(p == null)
		throw new RecordNotFoundException();
	projectRepository.delete(p);
   }

}
