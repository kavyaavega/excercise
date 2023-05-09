package com.avega.training.java.bookmanagement;

import java.time.LocalDate;

public class BookManagementMain {

	public static void main(String[] args) {
		
		BookInterface book= new BookImplementation();
		Author author = new Author();
		
		
		book.addBook(new Book(111,"The India Story",new Author(100,"Bimal Jalal",1235648563,"bimal@gmail.com"),250,LocalDate.of(2021, 04, 05),1500,new Publisher(123,"Pearson","No 12, 4th c cross vijaynagar")));
		book.addBook(new Book(122,"A Place Called Home",new Author(153,"Preeti Shenoy",1523648621,"preethi@gmail.com"),500,LocalDate.of(2022, 04, 25),3000,new Publisher(345,"Thomson Reuters","No 22 2nd cross jaynagar")));
		book.addBook(new Book(133,"Queen of Fire",new Author(163,"Devika Rangachari",1523622223,"devika@gmail.com"),1000,LocalDate.of(2023, 01, 02),2800,new Publisher(456,"Bertelsmann","No 45 8th main malleshwaram")));
        // System.out.println(book.updateBook(new Book(133,"The India Story","Bimal Jalal",200,LocalDate.of(2021, 04, 05),500," Jalal")));
		//System.out.println(book.getBooksByAuthorName("Bimal Jalal"));
		//System.out.println(book.getBooksByPublisher("Bertelsmann"));
		//System.out.println(book.getBooksByYear(2021));
		//System.out.println(book.getBooksByBookName("A Place Called Home"));
		//System.out.println(book.getBooksByPages(1000));
	}

}
