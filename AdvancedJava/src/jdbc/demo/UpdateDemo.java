package jdbc.demo;

/**
* Auhtor : Satyam.3.Singh
* Date   : 7 Nov 2024
* Time   : 3:33:00 pm
* Email  : satyam.3.singh@coforge.com
*/

public class UpdateDemo {
	
	public static void main(String[] args) {
		
		Candidates c1=new Candidates();
		
		try {
			
			c1.getConnection();
			c1.UpdateCandidate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
