package com.oops.basics;

public class BookMain {
	String title;
	String author;
	int price;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Book Book1 = new Book();
		Book1.title = "Hobbit";
		Book1.author = "david";
		Book1.price = 2000;
		
		System.out.println("Book Name: " + Book1.title);
		System.out.println("Book Id: " + Book1.author);
		System.out.println("Book Salary: " + Book1.price);
	}
}