package org.howard.edu.lsp.midterm.problem1;

public class Book {
	private String title;
	private String author;
	private int year;
	
	
	public Book(String title, String author, int year){
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public String toString() {
		String returnStr = this.title + ", " + this.author + ", " + this.year;
		return returnStr;
	}
	
	public boolean equals(Book book) {
		if (this.title == book.title && this.author == book.author) {
			return true;
		}
		return false;
	}

}
