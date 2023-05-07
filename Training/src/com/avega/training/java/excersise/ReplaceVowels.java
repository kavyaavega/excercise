package com.avega.training.java.excersise;

import java.util.Scanner;
/*Exclamation marks series #11: Replace all vowel to exclamation mark in the sentence*/

public class ReplaceVowels {

	public static void main(String[] args) {
		String str1, str2;
	       Scanner scan = new Scanner(System.in);
	       System.out.print("Enter a String : ");
	       str1 = scan.nextLine();
	       str2 = str1.replaceAll("[aeiouAEIOU]", "!");
	       System.out.println(str2);
    }
}
