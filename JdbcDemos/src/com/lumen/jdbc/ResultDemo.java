package com.lumen.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url ="jdbc:mysql://localhost:3306/mysql" ;
		String username="root";
		String password = "admin@123";
		String sql = "select*from employee";
		
		try(Connection connnection = DriverManager.getConnection(url,username,password);
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery(sql){
					while(rs.next()) {
						String employeename = rs.getString("employeename");
						int employeeId = rs.getInt("employeeid");
						String city =rs.getString(3);
						double salary = rs.getDouble("Salary");
						System.out.println(employeename+"\t"+employeeId + "\t" +city+"\t"+ salary );
					}
				}catch(SQLException e) {
			
	e.printStackTrace();
	}
}
}