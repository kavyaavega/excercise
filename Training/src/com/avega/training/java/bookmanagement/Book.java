package com.avega.training.java.bookmanagement;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
	
private int	isbnNo;

private String	bookName;

Author author;

private int	noOfPages;

private LocalDate	publishedYear;

private int	price;

Publisher	publisher;

public Book(int isbnNo, String bookName, Author author, int noOfPages, LocalDate publishedYear, int price,
		Publisher publisher) {
	super();
	this.isbnNo = isbnNo;
	this.bookName = bookName;
	this.author = author;
	this.noOfPages = noOfPages;
	this.publishedYear = publishedYear;
	this.price = price;
	this.publisher = publisher;
}

public Book() {
	super();
	// TODO Auto-generated constructor stub
}

public int getIsbnNo() {
	return isbnNo;
}

public void setIsbnNo(int isbnNo) {
	this.isbnNo = isbnNo;
}

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public Author getAuthor() {
	return author;
}

public void setAuthor(Author author) {
	this.author = author;
}

public int getNoOfPages() {
	return noOfPages;
}

public void setNoOfPages(int noOfPages) {
	this.noOfPages = noOfPages;
}

public LocalDate getPublishedYear() {
	return publishedYear;
}

public void setPublishedYear(LocalDate publishedYear) {
	this.publishedYear = publishedYear;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public Publisher getPublisher() {
	return publisher;
}

public void setPublisher(Publisher publisher) {
	this.publisher = publisher;
}

@Override
public String toString() {
	return "Book [isbnNo=" + isbnNo + ", bookName=" + bookName + ", author=" + author + ", noOfPages=" + noOfPages
			+ ", publishedYear=" + publishedYear + ", price=" + price + ", publisher=" + publisher + "]";
}

@Override
public int hashCode() {
	return Objects.hash(author, bookName, isbnNo, noOfPages, price, publishedYear, publisher);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	return Objects.equals(author, other.author) && Objects.equals(bookName, other.bookName) && isbnNo == other.isbnNo
			&& noOfPages == other.noOfPages && price == other.price
			&& Objects.equals(publishedYear, other.publishedYear) && Objects.equals(publisher, other.publisher);
}



}
