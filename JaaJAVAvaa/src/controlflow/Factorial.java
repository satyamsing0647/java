	package controlflow;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 24 Oct 2024
* Time   : 5:07:17 pm
* Email  : satyam.3.singh@coforge.com
*/

public class Factorial {
	 public static void main(String[] args) {
		 int n,fact=1,i;
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter a Number : ");
			n=scanner.nextInt();
			scanner.close();
			
			if(n > 0) {
				//Loop to find factorial
				for(i=1;i<=n;i++) {
					fact =fact *i;
				}
				
				System.out.println("The Factorial of "+n+" is : "+fact);
				
				}
			else {
				System.out.println("Please Enter Value greater Than Zero");
			}
			
	}
}
