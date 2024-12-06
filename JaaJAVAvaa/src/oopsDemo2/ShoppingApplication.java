package oopsDemo2;

import java.util.Scanner;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 28 Oct 2024
 * Time   : 11:47:30 am
 * Email  : satyam.3.singh@coforge.com
 */

public class ShoppingApplication {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("********** Online Shopping Portal ************");
		System.out.println("Enter customer name and email : ");
		String name=scan.nextLine();
		String email=scan.nextLine();

		Shoppingcart cart1 =new Shoppingcart(name, email);
		scan.close();


		//Add items to Cart
		cart1.addItem("Boat Ear Buds");//Invoke method addItem() for Object cart1
		cart1.addItem("Logitech Mouse");
		cart1.addItem("Samsung HDD");
		cart1.addItem("pen Drive");
		cart1.addItem("HDMI converter");
		cart1.addItem("HP Laser Printer");

		System.out.println("Customer Details :");
		cart1.display(); //Base class method
		System.out.println("Cart Details :");
		cart1.displayCart();
	}
}
