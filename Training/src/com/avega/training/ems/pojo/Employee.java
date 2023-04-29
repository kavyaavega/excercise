package com.avega.training.ems.pojo;



public class Employee {
	private int id;
	private String name;
	private long contact;
	private String department;
	

	public Employee(int id, String name, long contact, String department
			) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contact=" + contact + ", department=" + department + "]";
	}
}
