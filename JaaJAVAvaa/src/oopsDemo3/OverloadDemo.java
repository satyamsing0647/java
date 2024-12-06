package oopsDemo3;

/**
* Auhtor : Satyam.3.Singh
* Date   : 29 Oct 2024
* Time   : 12:27:55 pm
* Email  : satyam.3.singh@coforge.com
*/

public class OverloadDemo {
	public static void main(String[] args) {
		
		Addition ad1=new Addition(33, 45);
		
		ad1.add();
		ad1.add(999);
		ad1.add(89, 175);
		ad1.add(450, 350.50f);
		ad1.add(20.50f, 45.50f); // Type promotion - calls method with double type parameters
		ad1.add("Hello", "World");
		ad1.add(300, 250, 500);
	}
}
