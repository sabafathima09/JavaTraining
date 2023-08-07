package com.lumen.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreCreateDemo {
public static void main(String[] args) {
	String url ="jdbc:mysql://localhost:3306/mysql" ;
	String username="root";
	String password = "admin@123";
	String sql = "create table newmovie(moviename varchar(20),movieId int primary key,"
			+"genre varchar(20),language varchar(20))";
	try (Connection connection = DriverManager.getConnection(url, username, password);
		PreparedStatement preparedstatement = connection.prepareStatement(sql);){
			boolean result = preparedstatement.execute();
			System.out.println("Table created "+result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
