package com.oops.basics;

public class Book {

	String title;
	String author;
	int price;
	
	void printDetails() {
		System.out.println("Book title" + title);
		 System.out.println("Book author" +author);
		 System.out.println("Book price" +price);
		 }
	
	double getDiscountedPrice(double amount) {
		return (price - amount);
	}
}
