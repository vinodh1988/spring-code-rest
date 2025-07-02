package com.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Department;
import com.rest.entity.Emp;
import com.rest.repository.DeptRepository;

@Service
public class DeptService {
 @Autowired
 	private DeptRepository deptRepository;
 
 public List<Department> getAllDepts() {
 	return deptRepository.findAll();
 }
 
 public void addDept(Department dept) {
     for(Emp emp : dept.getEmployees()) {
		 emp.setDept(dept);
	 }
     deptRepository.save(dept);
 }
}
