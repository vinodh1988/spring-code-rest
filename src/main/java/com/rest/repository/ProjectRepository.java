package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.Project;

public interface ProjectRepository  extends JpaRepository<Project, Integer> {
  
 

}
