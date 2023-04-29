package com.avega.training.ems.excercises.pojo;

import java.util.Scanner;

public class PigLatinWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter The Sentance:");
		String sentence = scanner.nextLine();
		
		  String[] words = sentence.split(" ");
	        String piglatin = "";

	        for (String word : words) {
	            char firstChar = word.charAt(0);
	            String restOfWord = word.substring(1);
	            String piglatinWord = restOfWord + firstChar + "a";
	            piglatin += piglatinWord + " ";
	        }

	        System.out.println("Piglatin sentence: " + piglatin);

	}

}
