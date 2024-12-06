package Assignments;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 25 Oct 2024
* Time   : 12:10:43 pm
* Email  : satyam.3.singh@coforge.com
*/

public class Age {
	public static void main(String[] args) {
		
		int year=2024, a,age;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your year : ");
		age=scan.nextInt();
		scan.close();
		
		a=year-age;
		System.out.println("Your "+a+" years old!");
	}
}
