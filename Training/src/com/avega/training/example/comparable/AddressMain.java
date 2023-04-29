package com.avega.training.example.comparable;

import java.util.Arrays;

public class AddressMain {

	public static void main(String[] args) {
		

		Address  addresslist[] = {
				new Address(101,"vijaynagar","banglore","560023"),
				                 new Address(102,"jaynagar","banglore","560024"),
				                 new Address(101,"mg road","banglore","560021"),
		                         };
		Arrays.sort(addresslist);
		System.out.println(Arrays.toString(addresslist));
	}             
     
}
