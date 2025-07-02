package com.rest.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "departments")

public class Department {
 @Id
 private  Integer deptno;
 @Column
 private String dname;
 
 @OneToMany(mappedBy = "dept",cascade = jakarta.persistence.CascadeType.ALL)
 private Set<Emp> employees;

 public Department() {
 }

public Integer getDeptno() {
	return deptno;
}

public void setDeptno(Integer deptno) {
	this.deptno = deptno;
}

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public Set<Emp> getEmployees() {
	return employees;
}

public void setEmployees(Set<Emp> employees) {
	this.employees = employees;
}
 
}
