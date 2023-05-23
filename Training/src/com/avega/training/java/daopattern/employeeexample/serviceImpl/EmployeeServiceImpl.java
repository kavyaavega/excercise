package com.avega.training.java.daopattern.employeeexample.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.avega.training.employeeexample.dao.EmployeeDao;
import com.avega.training.employeeexample.dao.SkillsDao;
import com.avega.training.employeeexample.daoImpl.EmployeeDaoImpl;
import com.avega.training.employeeexample.daoImpl.SkillsDaoImpl;
import com.avega.training.java.daopattern.employeeexample.exception.EmployeeNotFoundException;
import com.avega.training.java.daopattern.employeeexample.pojo.Employee;
import com.avega.training.java.daopattern.employeeexample.pojo.Skill;
import com.avega.training.java.daopattern.employeeexample.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao employeedao = null;
	SkillsDao skilldao = null;

	public EmployeeServiceImpl() {
		this.employeedao = new EmployeeDaoImpl();
		this.skilldao = new SkillsDaoImpl();
	}

	@Override
	public List<Employee> findAllemployees() {
		return employeedao.getAllemployees();
	}

	@Override
	public List<Employee> findEmployeeByname(String name) {
		return employeedao.getEmployeeByname(name);
	}

	@Override
	public Employee findEmployeeByid(String empid) {
		Employee employee = null;
		try {
			employee = employeedao.getEmployeeByid(empid);
		} catch (EmployeeNotFoundException e) {
			
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public boolean createEmployee(Employee employee) {
		return employeedao.addEmployee(employee);
	}

	@Override
	public boolean removeEmployee(Employee employee) {
		return employeedao.deleteEmployee(employee);
	}

	@Override
	public Employee editEmployee(Employee employee) {
		return employeedao.updateEmployee(employee);
	}

	@Override
	public boolean LoadSkillsToEmployee(String empid, Set<Skill> skills) {
		return employeedao.assignSkillsToEmployee(skills, empid);
	}

	@Override
	public List<Employee> getEmployeeByJavaAndSpringBootSkills() {
		List<Employee> employeeList = new ArrayList<>();
		for (Employee employee : employeedao.getAllemployees()) {
			int count = 0;
			for (Skill skill : employee.getSkills()) {
				if (skill.getSkillName().equalsIgnoreCase("Java")
						|| skill.getSkillName().equalsIgnoreCase("Springboot")) {
					count += 1;
				}
			}
			
			if (count == 2)
				employeeList.add(employee);
		}
		return employeeList;
	}

	@Override
	public List<String> getSkillsByEmployee(String empid) {
		List<String> str = new ArrayList<>();
		employeedao.getAllemployees().forEach(emp -> {
			if (emp.getEmpid().equalsIgnoreCase(empid))
				emp.getSkills().forEach(skill -> {
					str.add(skill.getSkillName());
				});
		});
		return str;
	}
}
