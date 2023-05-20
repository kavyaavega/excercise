package com.avega.training.java.iostreams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookMain {

	public static void main(String[] args) throws IOException, DateTimeParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str);

		FileOutputStream file = new FileOutputStream("C:\\demo\\kavya\\file.txt");
		file.write(str.getBytes());

		FileInputStream fileInput = new FileInputStream("C:\\demo\\kavya\\file.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(fileInput));
		System.out.println(in.readLine());
		Book book = new Book();

		System.out.println("please enter the book isbn number");
		book.setBookIsbn(br.readLine());
		System.out.println("please enter book name");
		book.setBookName(br.readLine());
		System.out.println("please enter price");
		double price = Double.parseDouble(br.readLine());
		book.setPrice(price);
		System.out.println("please enter the date");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String date = br.readLine();
		LocalDate dateMgf = LocalDate.parse(date, formatter);
		book.setDate(dateMgf);
		System.out.println(book);
		String bookString = book.toString();

		FileOutputStream fileOut = new FileOutputStream("C:\\demo\\kavya\\file.txt");
		fileOut.write(bookString.getBytes());
		fileOut.close();

		FileReader fileReader = new FileReader("C:\\demo\\kavya\\file.txt");
		BufferedReader bufferReader = new BufferedReader(fileReader);
		String bookReader;
	
		List<Book> bookList = new ArrayList<Book>();
		while((bookReader = bufferReader.readLine())!= null) {
			String value[] = bookReader.split(",");
		String bookIsbn = value[0];
		String bookName = value[1];
		double pricebook = Double.parseDouble(value[2]);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String bookDate = value[3];
		LocalDate bd = LocalDate.parse(bookDate, formatter1);

		Book bookIn = new Book();
		bookIn.setBookIsbn(value[0]);
		bookIn.setBookName(value[1]);
		bookIn.setPrice(Double.parseDouble(value[2]));
		bookIn.setDate(bd);
		bookList.add(bookIn);
		//System.out.println(bookIn);
		}
		bufferReader.close();
		fileReader.close();
		
	}
}
