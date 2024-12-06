package oopsDemo3;

/**
* Auhtor : Satyam.3.Singh
* Date   : 29 Oct 2024
* Time   : 3:30:16 pm
* Email  : satyam.3.singh@coforge.com
*/

public class UpcastingDemo {
	public static void main(String[] args) {
		
		Item item;
		//upcasting - child object is referred by parent object
		item=new Book("Java Programming", 450, "James Gosling");
		item.display();//dynamic polymorphism
		
		//switch from one implementation to other. because of upcasting
		item=new Laptop("Ideapad", 600000, "Lenovo");
		item.display();//dynamic polymorphism
		
	
		item=new Book("Python made easy", 650, "Yeshwanth Kanetkar");
		item.display();//dynamic polymorphism
	}
}
