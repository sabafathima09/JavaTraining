package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
 
	public static List<Book> showBooks(){
		return Arrays.asList(
				new Book("java in action","John david","tech",1,900.90),
				new Book("computer networks","Robin","self -help",2,190.90),
				new Book("lord of rings","paul","fiction",5,230.90),
				new Book("data structures","Samuel","tech",8,390.90),
				new Book("the subtle art ","markson","Adventures",9,180.90)
				);
	}
}
