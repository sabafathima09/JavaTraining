package com.lumen.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url ="jdbc:mysql://localhost:3306/mysql" ;
		String username="root";
		String password = "admin@123";
		String sql = """
			        select*from newmovie  
			        
			        """;
		List<Movie> list = new ArrayList<Movie>();
		while(resultSet.next()) {
			String name= resultSet.getString("moviename");
			int movieId = resultSet.getInt("movieid");
			String genre= resultSet.getString("genre");
			String language= resultSet.getString("language");
		}
		Movie movie = new Movie();
		movie.getMname("")
		 
	 
		
		try(Scanner scanner = new Scanner(System.in);
				Connection connection = DriverManager.getConnection(url,username,password);
				PreparedStatement preparedStatement = connection.prepareStatement(query);){
				ResultSet resultSet = preparedStatement.executeQuery();){
			
			//set the value for placeholder
			preparedStatement.setString(12,"English");
	}

}
