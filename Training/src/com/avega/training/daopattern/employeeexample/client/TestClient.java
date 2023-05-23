package com.avega.training.daopattern.employeeexample.client;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.avega.training.java.daopattern.employeeexample.pojo.Employee;
import com.avega.training.java.daopattern.employeeexample.pojo.Skill;
import com.avega.training.java.daopattern.employeeexample.service.EmployeeService;
import com.avega.training.java.daopattern.employeeexample.service.SkillService;
import com.avega.training.java.daopattern.employeeexample.serviceImpl.EmployeeServiceImpl;
import com.avega.training.java.daopattern.employeeexample.serviceImpl.SkillServiceImpl;

public class TestClient {

	public static void main(String[] args) {
		Skill s1 = new Skill("101","Java");
		Skill s2 = new Skill("102","Springboot");
		Skill s3 = new Skill("103","react");
		Skill s4 = new Skill("104","Python");
		
		
		Set<Skill> set1 = new HashSet<>();
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);
		set1.add(s4);
		
		Set<Skill> set2 = new HashSet<>();
		set2.add(s1);
		set2.add(s2);
		set2.add(s3);
		set2.add(s4);
		
		Set<Skill> set3 = new HashSet<>();
		set3.add(s1);
		set3.add(s3);
		set3.add(s4);
		
		SkillService skillService=new SkillServiceImpl();
		skillService.createSkills(s1);
		skillService.createSkills(s2);
		skillService.createSkills(s3);
		skillService.createSkills(s4);
		
		EmployeeService employeeService=new EmployeeServiceImpl();
		employeeService.createEmployee(new Employee("111","Kavya",1231253,"testing",LocalDate.of(2023, 01, 01),10,null));
		employeeService.createEmployee(new Employee("222","Lingesh",1256347892,"developer",LocalDate.of(2023, 05, 15),15000,null));
		employeeService.createEmployee(new Employee("333","gokul",1452369853,"developer",LocalDate.of(2023, 03, 02),20000,null));

		employeeService.LoadSkillsToEmployee("111", set1);
		employeeService.LoadSkillsToEmployee("222", set2);
		employeeService.LoadSkillsToEmployee("333", set3);
		
//		1. employeeService.findAllemployees();
		//employeeService.findAllemployees().forEach(emp -> System.out.println(emp.getName()));
		
//		2. employeeService.getEmployeeByJavaAndSpringBootSkills();
		//employeeService.getEmployeeByJavaAndSpringBootSkills().forEach(emp->System.out.println(emp.getName()));
		
		//3.employeeService.getSkillsByEmployee("111").forEach(sk -> System.out.println(sk));
		
		/*employeeService.findEmployeeByid("444");
		System.out.println(employeeService.findEmployeeByid("444"));*/
		
		
		/*skillService.findSkillsByid("101");
		System.out.println(skillService.findSkillsByid("101"));*/
		
	}

}
