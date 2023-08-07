package com.lumen.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class BookStreamsDemo {

	public static void main(String[] args) {
		
		//create a list of books->convert to stream->get books by author->print
		List<Book> books=Arrays.asList(
		new Book("computer networks","Robin","self -help",2,190.90),
		new Book("lord of rings","paul","fiction",5,230.90),
		new Book("data structures","Samuel","tech",8,390.90),
		new Book("the subtle art ","markson","Adventures",9,180.90)
		);
		
//	books.stream()
//	.filter(book->book.getAuthor().equals("Robin"))
//	.forEach(book->System.out.println(book))
////	.map(book->book.getTitle
//	
		
//		books.stream()
//		.map(book->book.getTitle())
//		.map(title->Math.sqrt(title.length()))
		
		books.stream()
		.map(book->(int)Math.pow((int)book.getTitle().length(),2))
		.collect(Collectors.toList())
		.forEach(num->System.out.println(num));
}
}