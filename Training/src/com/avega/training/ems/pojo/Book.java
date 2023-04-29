package com.avega.training.ems.pojo;

public class Book {
	
	private String bookName;
	
	private String author;
	
	private int publishedYear;


	public Book(String bookName, String author, int publishedYear) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.publishedYear = publishedYear;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", publishedYear=" + publishedYear + "]";
	}

	

}
