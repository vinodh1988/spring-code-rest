package com.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Department;
import com.rest.repository.DeptRepository;

@Service
public class DeptService {
 @Autowired
 	private DeptRepository deptRepository;
 
 public List<Department> getAllDepts() {
 	return deptRepository.findAll();
 }
}
