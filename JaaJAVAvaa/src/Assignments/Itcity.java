package Assignments;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 25 Oct 2024
* Time   : 9:52:42 pm
* Email  : satyam.3.singh@coforge.com
*/

public class Itcity {
	public static void main(String[] args) {
		String city;
		Scanner s=new Scanner(System.in);

		System.out.println("Enter a City Name : ");
		city=s.next();

		//use equals() method for comparison of Strings.(Reference type)
		//use == operator for comparison primitive types
		
		if(city.equalsIgnoreCase("Bengaluru") || city.equalsIgnoreCase("Chennai") || 
				city.equalsIgnoreCase("hyderabad") || city.equalsIgnoreCase("Gurgaon") || city.equalsIgnoreCase("Bihar")) 
		{
			System.out.println(city+" is a IT City");
		}
		else
		{
			System.out.println(city+" is Not a IT City");
		}

		s.close();
	}
}
