package com.bookapp.client;

		// TODO Auto-generated method stub
		import java.util.ArrayList;
		import java.util.List;
		import com.bookapp.exception.BookNotFoundException;
		import com.bookapp.service.BookServiceImpl;
		import com.bookapp.service.IBookService;
		import com.bookapp.model.Book;

		public class BookMain {

			public static void main(String[] args)throws BookNotFoundException {
				IBookService bookService = new BookServiceImpl();

				bookService.getAll().stream().forEach(System.out::println);

				System.out.println();
				List<com.bookapp.model.Book> books = bookService.getByAuthorContains("John david");
				// forEach(System.out::println);
				for (com.bookapp.model.Book book : books) {
					System.out.println(book);
				}
				System.out.println();
				books = bookService.getByCategory("tech");
				for (com.bookapp.model.Book book : books) {
					System.out.println(book);
				}

				System.out.println();
				books = bookService.getByPriceLessthan(300);
				for (com.bookapp.model.Book book : books) {
					System.out.println(book);
				}

				System.out.println();
				books = bookService.getByAuthorContainsAndcategory("CJohn david", "tech");
				for (com.bookapp.model.Book book : books) {
					System.out.println(book);
				}

				System.out.println();
				System.out.println(bookService.getById(2));
				}}