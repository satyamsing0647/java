package controlflow;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 24 Oct 2024
* Time   : 4:26:36 pm
* Email  : satyam.3.singh@coforge.com
*/

public class SumPositive {
	public static void main(String[] args) {
		int sum =0,number=0;
		Scanner scanner=new Scanner(System.in);
		
		do {
			System.out.println("Enter a Number : ");
			number=scanner.nextInt();
			
			if(number > 0) {
				sum+=number;
			}
		} while (number>0);
		
		System.out.println("The Sum Of Positive Numbers entered by User is : "+sum);
		scanner.close();
	}
}
