package com.lumen.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreInsertScanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url ="jdbc:mysql://localhost:3306/mysql" ;
		String username="root";
		String password = "admin@123";
		String sql = "update newmovie set language =? where movieId =? ";
		try (
				Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			Scanner scanner = new Scanner(System.in)){
				for(int i=0;i<1;i++);
				System.out.println("Enter the movie");
				String moviename = scanner.next();
				System.out.println("Enter the movieId");
				int movieId = scanner.nextInt();
				System.out.println("Enter the genre");
				String genre = scanner.next();
				System.out.println("Enter the language");
				String language = scanner.next();
				
				preparedStatement.setString(1, moviename);
				preparedStatement.setInt(2, movieId);
				preparedStatement.setString(3, genre);
				preparedStatement.setString(4, language);
				preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}