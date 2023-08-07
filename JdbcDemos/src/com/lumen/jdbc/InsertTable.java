package com.lumen.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url ="jdbc:mysql://localhost:3306/mysql" ;
		String username="root";
		String password = "admin@123";
		 
		String query= "insert into employee values('Saba Fathima',101,'Bangalore',450000)";
		
		boolean result;
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			Statement statement = connection.createStatement();
			result = statement.execute(query);
			System.out.println("Table created "+result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

