package jdbc.demo;
import java.sql.*;
/**
* Auhtor : Satyam.3.Singh
* Date   : 7 Nov 2024
* Time   : 12:12:03 pm
* Email  : satyam.3.singh@coforge.com
*/


//Demonstrate projection

public class SelectDemo1 {
	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		
		try {
			
			con=ConnectionUtil.createConnection();
			stmt=con.createStatement();
			
			rs=stmt.executeQuery("SELECT first_name,last_name,email FROM candidates ORDER BY last_name");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString("last_name")+"\t"+rs.getString("email"));
			}
			con.close();
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
