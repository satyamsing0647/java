package oopsDemo3;

/**
* Auhtor : Satyam.3.Singh
* Date   : 29 Oct 2024
* Time   : 3:23:55 pm
* Email  : satyam.3.singh@coforge.com
*/

public class Laptop extends Item{
	private String manufacturer;

	public Laptop(String name, int price, String manufacturer) {
		super(name, price);
		this.manufacturer = manufacturer;
	}

	@Override
	void display() {
		super.display();
		System.out.println("Manufacturer : "+manufacturer);
	}
	
	
}
