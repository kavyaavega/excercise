package com.avega.training.ems.excercises.pojo;

import java.util.Scanner;

public class TraineeMainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Trainee trainee = new Trainee();
		
		System.out.print("please enter trainee id: ");
		trainee.setTraineeId(Integer.parseInt(scanner.nextLine()));
		
		System.out.println("TraineeId is"+trainee.getTraineeId());
		
		System.out.print("please enter  gender: ");
		trainee.setGender(scanner.nextLine());
		
		System.out.println("TraineeId is"+ trainee.getGender());

	}

}
