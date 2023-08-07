package com.lumen.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url ="jdbc:mysql://localhost:3306/mysql" ;
		String username="root";
		String password = "admin@123";
		Scanner scanner = new Scanner(System.in);g
		 
		String query= "update employee Name = 'Fathima', employee Id =109,City = '',450000)";
		UPDATE C
		SET ContactName = 'Alfred Schmidt', City= 'Frankfurt'
		WHERE CustomerID = 1;
		
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