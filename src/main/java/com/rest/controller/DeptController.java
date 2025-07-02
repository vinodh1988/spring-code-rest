package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Department;
import com.rest.services.DeptService;

@RestController
@RequestMapping("/api/v1/depts")
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
    @GetMapping("")
    public List<Department> getDepts() {
		return deptService.getAllDepts();
	}
    
    @PostMapping("")
    public ResponseEntity<Department> addDept(@RequestBody Department dept) {
		deptService.addDept(dept);
		return new ResponseEntity<>(dept, HttpStatus.CREATED);
	}
    
}
