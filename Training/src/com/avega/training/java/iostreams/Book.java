package com.avega.training.java.iostreams;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {
	private String bookIsbn;
    private String bookName;
    private double price;
    private LocalDate date;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookIsbn, String bookName, double price, LocalDate date) {
		super();
		this.bookIsbn = bookIsbn;
		this.bookName = bookName;
		this.price = price;
		this.date = date;
	}
	public String getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return bookIsbn + "," + bookName + "," + price + "," + date ;
	}
    
    

}
