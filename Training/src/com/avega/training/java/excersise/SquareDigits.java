package com.avega.training.java.excersise;

import java.util.Scanner;

public class SquareDigits {
	
	public static int squareDigits(int num) {
        String result = "";
        String numString = String.valueOf(num);
        for (int i = 0; i < numString.length(); i++) {
            int digit = Character.getNumericValue(numString.charAt(i));
            result += String.valueOf(digit * digit);
        }
        return Integer.parseInt(result);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int result = squareDigits(num);
        System.out.println("Result: " + result);
    }

}
