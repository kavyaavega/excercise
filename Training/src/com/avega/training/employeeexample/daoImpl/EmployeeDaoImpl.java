package com.avega.training.employeeexample.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.avega.training.employeeexample.dao.EmployeeDao;
import com.avega.training.java.daopattern.employeeexample.exception.EmployeeNotFoundException;
import com.avega.training.java.daopattern.employeeexample.pojo.Employee;
import com.avega.training.java.daopattern.employeeexample.pojo.Skill;

public class EmployeeDaoImpl implements EmployeeDao{
	
	List<Employee> employees = new ArrayList<>();

	@Override
	public List<Employee> getAllemployees() {
		return employees;
	}

	@Override
	public List<Employee> getEmployeeByname(String name) {
		List<Employee> employeelist=new ArrayList<>();
		for(Employee employee:employees)
		{
			if(employee.getName().equalsIgnoreCase(name)) {
				employeelist.add(employee);
			}	
		}
		return employeelist;
	}

	@Override
	public Employee getEmployeeByid(String empid) throws EmployeeNotFoundException {
		Employee employee = null;
		for(Employee employeefromlist:employees)
		{
			if(employeefromlist.getEmpid().equalsIgnoreCase(empid)) {
				employee=employeefromlist;
				break;
				
			}
		}
		if(employee == null) {
			throw new EmployeeNotFoundException();
		}
		return employee;
	}
	
	@Override
	public boolean addEmployee(Employee employee) {
		return employees.add(employee);
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		return employees.remove(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee updateEmployee = null;
		try {
			updateEmployee = getEmployeeByid(employee.getEmpid());
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}
		updateEmployee.setContact(employee.getContact());
		updateEmployee.setDepartment(employee.getDepartment());
		updateEmployee.setName(employee.getName());
		updateEmployee.setSalary(employee.getSalary());
		updateEmployee.setDoj(employee.getDoj());
		updateEmployee.setSkills(employee.getSkills());
		return updateEmployee;
	}

	@Override
	public boolean assignSkillsToEmployee(Set<Skill> skill, String empId) {
		boolean flag=false;
		for(Employee employee:employees) {
			if(employee.getEmpid().equalsIgnoreCase(empId)) {
				employee.setSkills(skill);
				if(employee.getSkills().equals(skill));
				flag=false;
			}
		}
		return flag;
	}

}
