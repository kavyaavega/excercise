package com.avega.training.java.bookmanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class BookImplementation implements BookInterface {

	Map<Integer,Book> map  = new HashMap<>();
	
	@Override
	public List<Book> getBooks() {
		return new ArrayList(map.values());
	}

	@Override
	public boolean addBook(Book book) {
		boolean flag = false;
		map.put(book.getIsbnNo(),book);
		if(map.get(book.getIsbnNo())!=null)
           flag=true;
		return flag;
	}

	@Override
	public boolean deleteBook(Book book) {
		boolean flag = false;
		map.remove(book.getIsbnNo());
		if(map.get(book.getIsbnNo())==null)
	           flag=true;
			return flag;
	}

	@Override
	public Book updateBook(Book book) {
		Book updateBook=null;
		updateBook=map.get(book.getIsbnNo());
		updateBook.setBookName(book.getBookName());
		updateBook.setAuthor(book.getAuthor());
		updateBook.setNoOfPages(book.getNoOfPages());
		updateBook.setPrice(book.getPrice());
		updateBook.setPublishedYear(book.getPublishedYear());
		updateBook.setPublisher(book.getPublisher());
		map.put(book.getIsbnNo(), updateBook);
		return updateBook;
	}

	@Override
	public List<Book> getBooksByAuthorName(String authorName) {
		List<Book> bookList = new ArrayList<>();
		for(Book book:map.values()) {
			if(book.getAuthor().getName().equalsIgnoreCase(authorName)){
				bookList.add(book);
			}
		}
			return bookList;
	}

	@Override
	public List<Book> getBooksByPublisher(String publisher) {
		List<Book> bookList = new ArrayList<>();
		for(Book book:map.values()) {
			if(book.getPublisher().getName().equalsIgnoreCase(publisher)) {
				bookList.add(book);
			}
		}
		return bookList;
	}

	@Override
	public List<Book> getBooksByYear(int year) {
		List<Book> bookList = new ArrayList<>();
		for(Book book:map.values()) {
			if(book.getPublishedYear().getYear()==year) {
				bookList.add(book);
			}
		}
		return bookList;
	}
	
	@Override
	public List<Book> getBooksByBookName(String bookName) {
		List<Book> bookList = new ArrayList<>();
		for(Book book:map.values()) {
			if(book.getBookName()==bookName){
				bookList.add(book);
			}
		}
			return bookList;
	}

	@Override
	public List<Book> getBooksByPages(int noOfPages) {
		List<Book> bookList = new ArrayList<>();
		for(Book book:map.values()) {
			if(book.getNoOfPages()==noOfPages) {
				bookList.add(book);
			}
		}
		return bookList;
	}

	@Override
	public List<Book> getBooksByPrice(int price, String operation) {
		List<Book> bookList = new ArrayList<>();
		for(Book book:map.values()) {
		
		switch (operation) {
		case "Greater than":
			if(book.getPrice()> price) {
			bookList.add(book);
			}
            break;
 
        case "Lesser than":
        	if(book.getPrice()< price) {
        		bookList.add(book);	
        	}
            break;
            
        case "Greater than or equal to":
        	if(book.getPrice()>= price) {
        		bookList.add(book);	
        	}
            break;
            
        case "Lesser than or equal to":
        	if(book.getPrice()<=price) {
        		bookList.add(book);	
        	}
            break;
		} 
		
	}
		return bookList;
 }
	
}
	
	
	
