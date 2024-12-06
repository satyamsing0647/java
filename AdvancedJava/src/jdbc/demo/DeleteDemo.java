package jdbc.demo;

import java.sql.Connection;
import java.sql.Statement;

/**
* Auhtor : Satyam.3.Singh
* Date   : 7 Nov 2024
* Time   : 4:17:23 pm
* Email  : satyam.3.singh@coforge.com
*/

public class DeleteDemo {
	
	public static void main(String[] args) {
		
		Connection con;
		Statement stmt;
		int cnt=0;
		
		try {
			
			con=ConnectionUtil.createConnection();
			String sql="DELETE from candidates where rtrim(last_name) "
					+"LIKE \'K%g\' ;";
			
			String sql1="DELETE from candidates where id=101;";
			
			stmt=con.createStatement();
			cnt=stmt.executeUpdate(sql);
			//cnt=stmt.executeUpdate(sql1);

			if(cnt > 0 ) {
				System.out.println(cnt+" Records Deleted");
			}
			else {
				System.out.println("Record Not Found");
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
