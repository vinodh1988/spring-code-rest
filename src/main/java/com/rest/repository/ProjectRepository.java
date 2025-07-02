package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.Project;

public interface ProjectRepository  extends JpaRepository<Project, Integer> {
  public Project findByPno(Integer pno); // Custom query method to find a project by its project number
 

}
