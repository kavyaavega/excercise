package com.avega.training.java.excersise;

import java.util.Scanner;

public class SumOfDigits {
	public static int recursiveSum(int num) {
        if (num < 10) {
            return num;
        }
        return recursiveSum(num/10) + num%10;
    }
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = recursiveSum(num);
        System.out.println(" Sum of digits is: " + sum);
    }

}
