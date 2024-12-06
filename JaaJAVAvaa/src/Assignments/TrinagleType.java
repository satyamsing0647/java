package Assignments;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 26 Oct 2024
* Time   : 7:25:41 pm
* Email  : satyam.3.singh@coforge.com
*/

public class TrinagleType {
	public static void main(String[] args){
		int a,b,c;
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the sides of the Triagnle");
		
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		scan.close();
		
		if (a==b && a==c) {
			System.out.println("The triangle is equilateral!");
		}
		else if (a==b || a==c) {
			System.out.println("The triangle is Isoceles!");
		}
		else {
			System.out.println("The triangle is Scalene!");
		}
	}
}
