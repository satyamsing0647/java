package jdbc.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 7 Nov 2024
 * Time   : 4:44:00 pm
 * Email  : satyam.3.singh@coforge.com
 */

public class Skills {

	Connection con;
	CallableStatement cstmt;
	ResultSet rs;

	int id;

	public Skills() throws Exception{
		con=ConnectionUtil.createConnection();
	}

	public void getSkills(int candidateID) throws Exception{

		//calling stored procedure with single parameter
		
		cstmt=con.prepareCall("{ call get_candidate_skill(?) }");
		cstmt.setInt(1, candidateID);
		rs=cstmt.executeQuery();
		
		// Check if the ResultSet is empty
	    if (!rs.next()) {
	        System.out.println("No Skills");
	    } else {
	        // If there is data, process it
	        do {
	            System.out.println(String.format("%s - %s",
	                    rs.getString("first_name") + " "
	                    + rs.getString("last_name"),
	                    rs.getString("skill")));
	        } while (rs.next());
	    }

		/*while (rs.next()) {
			System.out.println(String.format("%s - %s",
					rs.getString("first_name") + " "
							+ rs.getString("last_name"),
							rs.getString("skill")));
			
		}
		if(rs.getRow()==0) {
			System.out.println("No Skills");
		}*/
		con.close();
	}

}
