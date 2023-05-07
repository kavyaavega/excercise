package com.avega.training.java.excersise;

import java.util.Scanner;

public class CorrectMistakes {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the Sentance: ");
	        String sentance = scanner.nextLine();

	        String correctedSentance = correctSentance(sentance);
	        System.out.println("Corrected sentance: " + correctedSentance);
	    }

	    private static String correctSentance(String sentance) {
	    	sentance = sentance.trim();
	    	sentance = sentance.replaceAll("[oO0]", "0"); 
	    	sentance = sentance.replaceAll("[lI1]", "1"); 
	    	sentance = sentance.replaceAll("[sS5]", "5");
	    	
	        return sentance;
	    }
	}

