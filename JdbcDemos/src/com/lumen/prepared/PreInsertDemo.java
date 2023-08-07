package com.lumen.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreInsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url ="jdbc:mysql://localhost:3306/mysql" ;
		String username="root";
		String password = "admin@123";
		String sql = "insert into newmovie values(?,?,?,?)";
		try (Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			
		preparedStatement.setString(1,"24");
		preparedStatement.setInt(2, 21);
		preparedStatement.setString(3, "Thriller");
		preparedStatement.setString(4, "English");
		preparedStatement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
