package oopsDemo3;

/**
* Auhtor : Satyam.3.Singh
* Date   : 29 Oct 2024
* Time   : 3:00:29 pm
* Email  : satyam.3.singh@coforge.com
*/

public class OverrideDemo2 {
	public static void main(String[] args) {
		
		ElectronicsProduct ep1=new ElectronicsProduct("Laptop", 999.99, "Dell", "Latitude");
		ClothingProduct cp1=new ClothingProduct("T-Shirt", 15.50f, "Medium", "Indigo");
		
		System.out.println("******** Electronic Product Details **********");
		ep1.displayDetails();
		
		System.out.println("******** Clothing Product Details ***********");
		cp1.displayDetails();
	}
}
