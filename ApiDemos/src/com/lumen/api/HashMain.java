package com.lumen.api;

public class HashMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if title and isbn number are same they are same objects
		
		Book book1 = new Book("HeadFirst Java","Kathleen",12352807L);
		Book book2 = new Book("Basics Java","george",78352807L);
		Book book3 = new Book("Fundamentals of Java","mathew",98352807L);
		
		System.out.println("1 and 2"+book1.equals(book2));
		System.out.println("1 ans 3"+book2.equals(book3));
		System.out.println("1 hash:"+book1.hashCode());
		System.out.println("1 hash:"+book2.hashCode());
		System.out.println("1 hash:"+book3.hashCode());
		
	}

}