package controlflow;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 24 Oct 2024
* Time   : 4:31:29 pm
* Email  : satyam.3.singh@coforge.com
*/

public class ShoppingApp {
	public static void main(String[] args) {
		
		String userInput=null;
		Scanner scanner=new Scanner(System.in);
		
		do {
			System.out.println("Welcome To Our Online Shopping App");
			System.out.println("1. View Products");
			System.out.println("2. Add Products");
			System.out.println("3. Check Out");
			System.out.println("4. Exit");
			
			System.out.println("Enter Yout Choice");
			int choice=scanner.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Displaying Products......");
				break;
			case 2: 
				System.out.println("Adding Products......");
				break;
			case 3: 
				System.out.println("Checking Out......");
				break;
			case 4: 
				System.out.println("Exit......Bye");
				return;
			default: 
				System.out.println("Invalid Choice Please Try Again.");
			}
			System.out.println("do you want to continue the shopping? (yes/no):");
			userInput=scanner.next();		
	}
	while(userInput.equalsIgnoreCase("yes"));
		System.out.println("Thanks for shopping with us !!");
		scanner.close();
	}
}
