package arraysDemo;

import java.util.Scanner;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 24 Oct 2024
 * Time   : 4:31:29 pm
 * Email  : satyam.3.singh@coforge.com
 * 
 * Code to create Simple Online Shopping App to View,Add & Check out Products.
 Use do-while loop to repeatedly prompt the user for actions until they choose to exit
 */

public class ShoppingApp {
	public static void main(String[] args) {

		String userInput=null;
		Scanner scanner=new Scanner(System.in);
		
		String[] products = {"Logitech Mouse","Boat Earbuds","Hp gaming laptop", "Samsung HDD","philips Magic lights","Hp Printer"};
		String[] cart= new String[products.length];
		int cartIndex=0;

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
				for (int i=0; i <products.length; i++) {
					System.out.println(i+1+". "+products[i]);
				}
				break;
			case 2: 
				System.out.println("Adding Products......");
				System.out.println("Enter product number to add to cart: ");
				int pno=scanner.nextInt();
				if (pno > 0 && pno <= products.length) {
					cart[cartIndex++]=products[pno-1];
					System.out.println("product added to the cart");
				}
				else {
					System.out.println("Invalid product number");
				}
				break;
			case 3: 
				System.out.println("Checking Out......");
				for (int i=0; i <cartIndex;i++) {
					System.out.println((i+1)+". "+cart[i]);
				}
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
