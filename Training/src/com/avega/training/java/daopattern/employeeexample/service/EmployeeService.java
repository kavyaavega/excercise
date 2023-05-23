package com.avega.training.java.daopattern.employeeexample.service;


import java.util.List;
import java.util.Set;

import com.avega.training.java.daopattern.employeeexample.pojo.Employee;
import com.avega.training.java.daopattern.employeeexample.pojo.Skill;

public interface EmployeeService {
	
	List<Employee> findAllemployees();
	List<Employee> findEmployeeByname(String name);
	Employee findEmployeeByid(String empid);
	boolean  createEmployee(Employee employee);
	boolean  removeEmployee(Employee employee);
	Employee editEmployee(Employee employee);
	
	boolean LoadSkillsToEmployee(String empid,Set<Skill> skills);
	List<Employee> getEmployeeByJavaAndSpringBootSkills();
	List<String> getSkillsByEmployee(String empid);

}
