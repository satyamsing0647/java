package Assignments;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 28 Oct 2024
* Time   : 1:18:43 am
* Email  : satyam.3.singh@coforge.com
*/

public class addnumber {
	public static void main(String[] args) {
	int integer,sum=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the Integer for the sum : ");
		
		integer=scan.nextInt();
		scan.close();
		
		while (integer!=0) {
			sum=sum+integer%10;
			integer=integer/10;
		}
		System.out.println("the sum of the integer is : " +sum);
	}
}
