package com.company.library;

public class Book {

	private int bookId;
	private String title;
	private String author;
	private String genre;
	private double price;
	private int yearOfPublicaion;
	
	public Book(int bookId, String title, String author, String genre, double price, int yearOfPublicaion) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.price = price;
		this.yearOfPublicaion = yearOfPublicaion;
	}
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", genre=" + genre + ", price="
				+ price + ", yearOfPublicaion=" + yearOfPublicaion + "]";
	}


	public int getBookId() {
		return bookId;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getGenre() {
		return genre;
	}
	public double getPrice() {
		return price;
	}
	public int getYearOfPublicaion() {
		return yearOfPublicaion;
	}
	
}
