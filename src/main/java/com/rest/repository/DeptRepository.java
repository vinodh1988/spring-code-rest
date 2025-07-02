package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.Department;



public interface DeptRepository extends JpaRepository<Department, Integer> {

}
