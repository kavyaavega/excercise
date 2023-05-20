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

public class BookWriter {

	public static void main(String[] args) throws IOException, DateTimeParseException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("please enter the no of books : ");
        List<Book> bookList = new ArrayList<>();
        int i = 0;
        String value = br.readLine();
        FileOutputStream fileOut = new FileOutputStream("C:\\demo\\kavya\\file.txt");
        while (i< Integer.parseInt(value)) {
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
//            bookList.add(book);
            fileOut.write((book.toString() + "\n").getBytes());
//            fileOut.wait();
            i++;
        }
        fileOut.close();	
	}
}
