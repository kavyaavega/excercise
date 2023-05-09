package com.avega.training.java.bookmanagement;

import java.util.List;

public interface BookInterface {
	
List<Book> getBooks();

boolean addBook(Book book);

boolean deleteBook(Book book);

Book updateBook(Book book);

List<Book>  getBooksByAuthorName(String  authorName);

List<Book>  getBooksByPublisher(String  publisher);

List<Book>  getBooksByYear(int year);

List<Book>  getBooksByBookName(String  bookName);

List<Book>  getBooksByPages(int noOfPages);

List<Book>  getBooksByPrice(int price, String operation);



}
