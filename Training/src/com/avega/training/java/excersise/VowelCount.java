package com.avega.training.java.excersise;

import java.util.Scanner;
/*Vowel Count*/

public class VowelCount {

	public static void main(String[] args) {
		String str;
		 Scanner scan = new Scanner(System.in);
	       System.out.print("Enter a String : ");
	       str = scan.nextLine();
        int count = 0;
 
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                || str.charAt(i) == 'i'
                || str.charAt(i) == 'o'
                || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println( "Total no of vowels in string are: " + count);

	}

}
