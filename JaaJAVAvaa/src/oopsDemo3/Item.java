package oopsDemo3;

/**
* Auhtor : Satyam.3.Singh
* Date   : 29 Oct 2024
* Time   : 3:22:24 pm
* Email  : satyam.3.singh@coforge.com
*/

public class Item {
	private String name;
	private int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
    void display() {
        System.out.println("********** Item Details ***************");
        System.out.println("Name         : "+name);
        System.out.println("Price        : "+price);
    }
	
}
