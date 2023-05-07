package com.avega.training.java.excersise;

import java.util.Scanner;

public class BitCounting {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >>> 1;
        }
        System.out.println("Number of ones in binary representation: " + count);
    }

}
