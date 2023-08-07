package com.lumen.api;

import java.util.Objects;

public class Book {
	
	private String title;
	private String author;
	private long ishbNumber;
	public Book(String title, String author, long ishbNumber) {
		super();
		this.title = title;
		this.author = author;
		this.ishbNumber = ishbNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ishbNumber, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return  ishbNumber == other.ishbNumber && Objects.equals(title, other.title);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getIshbNumber() {
		return ishbNumber;
	}
	public void setIshbNumber(long ishbNumber) {
		this.ishbNumber = ishbNumber;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ishbNumber=" + ishbNumber + "]";
	} 
	
	

}
