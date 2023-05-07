package com.avega.training.java.localdate.excercises;
//10. Convert String to LocalDate
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToLocalDate {

	public static void main(String[] args) {
		String dateString = "2023-05-07";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(dateString, dateTimeFormatter);
		System.out.println(date);

	}

}
