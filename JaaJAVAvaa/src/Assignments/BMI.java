package Assignments;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 25 Oct 2024
* Time   : 2:22:22 pm
* Email  : satyam.3.singh@coforge.com
*/

public class BMI {
	public static void main(String[] args) {
		
		float Height,Weight;
		final float BMI;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter your weight in KGs : ");
		Weight=scan.nextInt();
		System.out.println("Please Enter your Height in Meters : ");
		Height=scan.nextFloat();
		scan.close();
		
		BMI= Weight/(Height*Height);
		
		System.out.print("Your BMI is : ");
		System.out.format("%.2f", BMI);
		}
}
