package com.company.library;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		Book[] book = new Book[5];
		book[0] = new Book(1, "The Alchemist", "Paulo Coelho", "Fiction", 12.99, 1988);
		book[1] = new Book(2, "Inferno", "Dan Brown", "Thriller", 15.50, 2013);
		book[2] = new Book(3, "To Kill a Mockingbird", "Harper Lee", "Classic", 10.75, 1960);
		book[3] = new Book(4, "The Da Vinci Code", "Dan Brown", "Mystery", 13.25, 2003);
		book[4] = new Book(5, "Sapiens", "Yuval Noah Harari", "Non-fiction", 18.00, 2011);
		
		List<Book> books = Arrays.asList(book);
		
		System.out.println("Books published after the year 2010 :");
		List<Book> b1 = books.stream().filter(i -> i.getYearOfPublicaion() > 2010) .collect(Collectors.toList());
		b1.forEach(System.out::println);
		
		System.out.println("\n\nBooks sorted by price (ascending):");
		books.stream().sorted(Comparator.comparingDouble(Book::getPrice));
	    books.forEach(System.out::println);
			
	    System.out.println("\n\nBooks with higest price:");
	    Book higestPrice = books.stream().max(Comparator.comparingDouble(Book::getPrice)).orElse(null);
	    System.out.println(higestPrice);
	    
	    System.out.println("\n\nTotal number of books : "+books.stream().count());
	    
	    System.out.println("\n\nBooks title to Uppercase :");
	    List<String> booksTitle = books.stream().map(i -> i.getTitle().toUpperCase()).collect(Collectors.toList());
	    System.out.println(booksTitle);
	    
	    System.out.println("\n\nOldest book:");
	    double totalprice = books.stream().mapToDouble(i -> i.getPrice()).sum();
	    System.out.println(totalprice);
	    
	    System.out.println("\n\nOldest book:");
	    List<Book> old = books.stream().sorted(Comparator.comparing(Book::getYearOfPublicaion)).limit(1).collect(Collectors.toList());
	    System.out.println(old);
	    
		
		
		
	}

}
