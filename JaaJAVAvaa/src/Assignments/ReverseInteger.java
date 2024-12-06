package Assignments;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 27 Oct 2024
* Time   : 12:00:43 pm
* Email  : satyam.3.singh@coforge.com
*/

public class ReverseInteger {
	public static void main(String[] args) {
		
		int integer,reverse=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the Integer to get reversed : ");
		
		integer=scan.nextInt();
		scan.close();
		
		while (integer!=0) {
			int remainder=integer%10;
			reverse=reverse*10+remainder;
			integer=integer/10;
		}
		System.out.println("the reversed integer is : " +reverse);
	}
}
