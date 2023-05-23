package com.avega.training.java.daopattern.employeeexample.pojo;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

public class Employee {
	private String empid;
	private String name;
	private long contact;
	private String department;
	private LocalDate doj;
	private double salary;
	private Set<Skill>skills;
	
	public Employee(String empid, String name, long contact, String department, LocalDate doj, double salary,
			Set<Skill> skills) {
		super();
		this.empid = empid;
		this.name = name;
		this.contact = contact;
		this.department = department;
		this.doj = doj;
		this.salary = salary;
		this.skills = skills;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Set<Skill> getSkills() {
		return skills;
	}
	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", contact=" + contact + ", department=" + department
				+ ", doj=" + doj + ", salary=" + salary + ", skills=" + skills + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(contact, department, doj, empid, name, salary, skills);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return contact == other.contact && Objects.equals(department, other.department)
				&& Objects.equals(doj, other.doj) && Objects.equals(empid, other.empid)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(skills, other.skills);
	}	
}

	

