package oopsDemo2;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 28 Oct 2024
 * Time   : 2:45:02 pm
 * Email  : satyam.3.singh@coforge.com
 */

public class RegisteredCustomer extends customer{

	private  int customerId;
	private String[] cart;
	private int cartSize;

	public RegisteredCustomer(String name, String email,int customerId) {
		super(name, email);
		this.customerId=customerId;
		this.cart=new String[20]; // Registered Customers can add 20 Items to cart
		this.cartSize=0;

	}
	public void displayCustomerInfo() {
		System.out.println("Customer ID: " + customerId);
		super.display();
	}

	public void addToCart(String item) {
		if (cartSize < cart.length) {
			cart[cartSize] = item;
			cartSize++;
			System.out.println(item + " added to cart.");
		} else {
			System.out.println("Cart is full. Cannot add more items.");
		}
	}

	public void displayCart() {
		System.out.println("Items in Cart:");
		for (int i = 0; i < cartSize; i++) {
			System.out.println(cart[i]);
		}
	}
}
