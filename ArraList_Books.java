package com.javacollections;

import java.util.*;

 class Book {
	
	private int bookId;
	private String bookName;
	private String authorName;

	public Book(int bookId,String bookName, String authorName ) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setBookNmae(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthor(String authorName) {
		this.authorName = authorName;
	}
	
	

}
public class ArraList_Books {

	public static void main(String[] args) {

	ArrayList<Book> bookList = new ArrayList<Book>();
	
	bookList.add(new Book(1, "Oracle", "Andrew Pyper"));
    bookList.add(new Book(2, "SpringBoot", "Rod Johnson"));
    bookList.add(new Book(3, "SpringMVC", "Amuthan"));

    // Displaying all book details
    System.out.println("Book Details:");
    for (Book book : bookList) {
        System.out.println("Book ID: " + book.getBookId());
        System.out.println("Book Name: " + book.getBookName());
        System.out.println("Author Name: " + book.getAuthorName());
        System.out.println();
    }
}
}