package com.avega.training.ems.excercises.pojo;

public class CompanyMainClass {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "kavya", 10000, "Developer");
	    Employee e2 = new Employee(2, "Lingesh", 40000, "Developer");
	    Employee e3 = new Employee(3, "Gokul", 60000, "Developer");
	    
	   
	    Department d1 = new Department(1, "Engineering", new Employee[]{e1, e3});
	    Department d2 = new Department(2, "Sales", new Employee[]{e1});
	    
	    
	    Company c = new Company("Acme Corp", new Department[]{d1, d2});
	    
	    
	    System.out.println("Employees in Engineering department:");
	    for (Employee e : c.getEmployeesByDept(1)) {
	        System.out.println("\t" + e.getName() + " (ID: " + e.getEmpId() + ")");

	}
  }
}
