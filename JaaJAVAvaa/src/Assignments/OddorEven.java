package Assignments;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 25 Oct 2024
* Time   : 4:37:52 pm
* Email  : satyam.3.singh@coforge.com
*/

public class OddorEven {

	public static void main(String[] args) {
		
		int a;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your number : ");
		a=scan.nextInt();
		scan.close();
		
		if (a%2==0) {
			System.out.println("The enterd number is Even");
		}
		else {
			System.out.println("The enterd number is Odd");
		}
	}

}
