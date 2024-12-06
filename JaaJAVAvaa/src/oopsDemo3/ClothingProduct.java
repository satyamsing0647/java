package oopsDemo3;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 29 Oct 2024
 * Time   : 2:57:15 pm
 * Email  : satyam.3.singh@coforge.com
 */

public class ClothingProduct extends Product{

	private String size;
	private String color;


	public ClothingProduct(String name, double price, String size, String color) {
		super(name, price);
		this.size = size;
		this.color = color;
	}


	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.println("Size   : "+size);
		System.out.println("Color  : "+color);
		System.out.println("Material: Cotton");	}


}
