package com.avega.training.java.localdate.excercises;
//11.Convert LocalDate to string
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateToString {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 05, 07);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String dateString = date.format(formatter);
		System.out.println("String:" + dateString);

	}

}
