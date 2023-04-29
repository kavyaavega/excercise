package com.avega.training.ems.excercises.pojo;

import java.util.Arrays;
import java.util.Objects;

public class Company {
	
private	String companyName;

private	Department[] depts;

public Company(String companyName, Department[] depts) {
	super();
	this.companyName = companyName;
	this.depts = depts;
}

/**
 * @return the companyName
 */
public String getCompanyName() {
	return companyName;
}

/**
 * @param companyName the companyName to set
 */
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

/**
 * @return the depts
 */
public Department[] getDepts() {
	return depts;
}

/**
 * @param depts the depts to set
 */
public void setDepts(Department[] depts) {
	this.depts = depts;
}

@Override
public String toString() {
	return "Company [companyName=" + companyName + ", depts=" + Arrays.toString(depts) + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Arrays.hashCode(depts);
	result = prime * result + Objects.hash(companyName);
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Company other = (Company) obj;
	return Objects.equals(companyName, other.companyName) && Arrays.equals(depts, other.depts);
}


//Method to get employees by department ID
public Employee[] getEmployeesByDept(int deptId) {
	for (Department d : depts) {
		if (d.getDeptId() == deptId) {
            return d.getEmps();
		}
		
	}
	return null;	
}

// Method to get employees by salary
public Employee[] getEmployeesBySalary(double salary) {
	for (Department d : depts) {
		for (Employee e : d.getEmps()) {
            if (e.getSalary() == salary) {
               return d.getEmps();
            }
        }
   }
	return null;
}

//Method to get employees by designation
public Employee[] getEmployeesByDesignation(String designation) {
	for (Department d : depts) {
		for (Employee e : d.getEmps()) {
			if (e.getDesignation().equals(designation)) {
				return d.getEmps();
		}
	}
}
	return null;	
}

//Method to print company details
public void printDetails() {
    System.out.println("Company Name: " + companyName);
    for (Department d : depts) {
        System.out.println("Department Name: " + d.getName());
        System.out.println("Employees: ");
        for (Employee e : d.getEmps()) {
            System.out.println("\t" + e.getName() + " (ID: " + e.getEmpId() + ")");
        }
    }
}



}
