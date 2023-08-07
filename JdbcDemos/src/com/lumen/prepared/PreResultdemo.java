package com.lumen.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreResultdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		String url ="jdbc:mysql://localhost:3306/mysql" ;
		String username="root";
		String password = "admin@123";
		String query = """
			        select*from newmovie where language=?""";
		
		try(Scanner scanner = new Scanner(System.in);
				Connection connection = DriverManager.getConnection(url,username,password);
				PreparedStatement preparedStatement = connection.prepareStatement(query);){
								
			//set the value for placeholder
			String languageByUser = scanner.next();
			preparedStatement.setString(1,languageByUser);
			
			try(ResultSet resultSet = preparedStatement.executeQuery()) {
				
			while(resultSet.next()) {
				String name= resultSet.getString("moviename");
				int movieId = resultSet.getInt("movieid");
				String genre= resultSet.getString("genre");
				String language= resultSet.getString("language");
				System.out.println("Movie Name:"+name);
				System.out.println("Movie ID :"+movieId);
				System.out.println("Genre:"+genre);
				System.out.println("Language:"+language);
				System.out.println();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}catch(SQLException e) {
			e.printStackTrace();
	}
	}
}