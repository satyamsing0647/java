package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
* Auhtor : Satyam.3.Singh
* Date   : 7 Nov 2024
* Time   : 12:08:13 pm
* Email  : satyam.3.singh@coforge.com
*/

//utility class to connect my sql server

public class ConnectionUtil {
	
	public static Connection createConnection() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","cfg@1234");
		return con;
	}
}
