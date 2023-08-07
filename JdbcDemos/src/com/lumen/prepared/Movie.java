package com.lumen.prepared;

public class Movie {
private String moviename;
private int movieId;
private String language;
private String genre;
public Movie() {
	super();
	// TODO Auto-generated constructor stub
}
public Movie(String mname, int movieId, String language, String genre) {
	super();
	this.moviename = mname;
	this.movieId = movieId;
	this.language = language;
	this.genre = genre;
}
public String getMname() {
	return moviename;
}
public void setMname(String mname) {
	this.moviename = mname;
}
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
@Override
public String toString() {
	return "Movie [moviename=" + moviename + ", movieId=" + movieId + ", language=" + language + ", genre=" + genre + "]";
}
}
