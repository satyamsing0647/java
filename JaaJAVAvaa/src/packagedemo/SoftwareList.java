package packagedemo;

import com.coforge.training.microsoft.OperatingSystem;
import com.coforge.training.oracle.*;
/**
* Auhtor : Satyam.3.Singh
* Date   : 4 Nov 2024
* Time   : 3:13:17 pm
* Email  : satyam.3.singh@coforge.com
*/

public class SoftwareList {

		public static void main(String[] args) {
			
			Database db1= new Database();
			OperatingSystem os1=new OperatingSystem();
			
			System.out.println("******* Database Softwares ********");
			db1.printSoftware();
			
			System.out.println("******* Operating System ********");
			os1.listSoftware();
		}
}
