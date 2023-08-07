package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo {
	public static void main(String[] args) {
	String url ="jdbc:mysql://localhost:3306/mysql" ;
	String username="root";
	String password = "admin@123";
	
	try(Connection connection = DriverManager.getConnection(url,username,password);
			Statement statement = connection.createStatement();
			Scanner scanner = new Scanner(System.in);){
			for(int i = 0;i<4;i++) {
				System.out.println("enter the employee name");
				String name = scanner.next();
				System.out.println("enter the employee ID");
				int employeeId = scanner.nextInt();
				System.out.println("enter the employee city");
				String city = scanner.next();
				System.out.println("enter the employee name");
				double salary = scanner.nextDouble();
				String sql = "insert table employee('"+name +"',"+employeeId"',"+city+"',"+salary+")";
				int result = statement.executeUpdate(sql);
				System.out.println("Inserted"+result);
				}catch(SQLException e) {
				e.printStackTrace();
	}
}
