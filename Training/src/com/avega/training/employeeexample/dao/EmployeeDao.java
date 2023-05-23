package com.avega.training.employeeexample.dao;

import java.util.List;
import java.util.Set;

import com.avega.training.java.daopattern.employeeexample.exception.EmployeeNotFoundException;
import com.avega.training.java.daopattern.employeeexample.pojo.Employee;
import com.avega.training.java.daopattern.employeeexample.pojo.Skill;


public interface EmployeeDao {
	
	List<Employee> getAllemployees();
	List<Employee> getEmployeeByname(String name);
	Employee getEmployeeByid(String empid) throws EmployeeNotFoundException;
	boolean addEmployee(Employee employee);
	boolean deleteEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	boolean  assignSkillsToEmployee(Set<Skill> skill, String empId);

}
