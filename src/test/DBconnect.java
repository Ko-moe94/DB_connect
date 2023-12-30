package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_database", "root", "root");//Establishing connection
			System.out.println("Connected With the database successfully");
		
			Statement stmt = connection.createStatement();
			//Executing the query and getting the result set
			ResultSet rs = stmt.executeQuery("select * from user");

			//Iterating the resultset and printing the 3rd column
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));			} 
			System.out.println("Git Test");
		}catch (SQLException e) {
				System.out.println("Error while connecting to the database");		
			}
}
}
