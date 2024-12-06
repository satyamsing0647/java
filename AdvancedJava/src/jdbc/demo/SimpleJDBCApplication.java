package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
* Auhtor : Satyam.3.Singh
* Date   : 7 Nov 2024
* Time   : 10:50:01 am
* Email  : satyam.3.singh@coforge.com
*/

public class SimpleJDBCApplication {
	public static void main(String[] args) {
		
		try {
			
			//load the jdbc driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels";
			String username="root";
			String password="cfg@1234";
			Connection connection= DriverManager.getConnection(url,username,password);
			
			//execute the query
			
			java.sql.Statement statement= connection.createStatement();
			String sql= "SELECT * FROM employees";
			ResultSet resultset= statement.executeQuery(sql);
			
			System.out.println("Employee Number\t First Name\t Designation");
			System.out.println("-------------------------------------------------");
			while (resultset.next()) {
				int employeeNumber = resultset.getInt("employeeNumber");
				String firstName= resultset.getString("firstName");
				System.out.println(employeeNumber+"\t\t"+ firstName +"\t\t"+ resultset.getString(8));
			}
			resultset.close();
			statement.close();
			connection.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
