package com.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rest.entity.Project;

public interface ProjectRepository  extends JpaRepository<Project, Integer> {
  public Project findByPno(Integer pno); // Custom query method to find a project by its project number
 
  @Query("SELECT p FROM Project p WHERE p.teamsize >= :min AND p.teamsize <= :max")
  public List<Project> findBySize(@Param("min") Integer min,@Param("max") Integer max); // Custom query method to find projects by technology

}
