package com.avega.training.ems.pojo;


import java.util.Arrays;
import java.util.Scanner;

import com.avega.training.ems.excercises.pojo.Project;

	public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*Project project = new Project();
		
		System.out.print("please enter project id: ");
		project.setProjectId(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("please enter project name: ");
		project.setProjectName(scanner.nextLine());
		
		System.out.print("please enter project head: ");
		project.setProjectHead(scanner.nextLine());
		
		System.out.print("please enter no ofresources: ");
		project.setNoOfResources(Integer.parseInt(scanner.nextLine()));
		
		System.out.println("ProjectId is"+project.getProjectId());
		System.out.println("ProjectName is"+project.getProjectName());
		System.out.println("ProjectHead is"+project.getProjectHead());
		System.out.println("ProjectNoOfResources is"+project.getNoOfResources());
		scanner.close();*/
		
		/*System.out.print("Enter the number"+":");
		int number = Integer.parseInt(scanner.nextLine());*/
		
				
		 Project[] projects = new Project[5];

		    
		    Project project1 = new Project(101, "lpms","naveen",2);
		    projects[0] = project1;
		    
		    Project project2 = new Project(102, "chanakya","arun",3);
		    projects[0] = project2;
		    
		    Project project3 = new Project(103, "lpms testing","arun",4);
		    projects[0] = project3;
		    
		    Project project4 = new Project(104, "chanakya testing","arun",1);
		    projects[0] = project4;
		    
		    Project project5 = new Project(105, "chanakya testing","arun",5);
		    projects[0] = project5;


		    for (int i = 0; i < projects.length; i++) {
		        System.out.println("ProjectId " + (i+1) +projects[i].getProjectId());
		        System.out.println("ProjectName: " + projects[i].getProjectName());
		        System.out.println("ProjectHead: " + projects[i].getProjectHead());
		        System.out.println("NoOfResources: " + projects[i].getNoOfResources());
		        
		        System.out.println();
		      }	    
	}
		
}