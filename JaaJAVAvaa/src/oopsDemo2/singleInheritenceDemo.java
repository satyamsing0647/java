package oopsDemo2;

/**
* Auhtor : Satyam.3.Singh
* Date   : 28 Oct 2024
* Time   : 10:33:14 am
* Email  : satyam.3.singh@coforge.com
*/

public class singleInheritenceDemo {
	public static void main(String[] args) {
		developer d1=new developer(1111, "satyam", 50000, "jdbc");
		developer d2=new developer(2222, "shiva", 60000, "Hibernate");
		developer d3=new developer(3333, "chandu", 40000, "Spring Framework");
		
		d1.display();
		d1.displayDeveloperDetails();
		
		d2.display();
		d2.displayDeveloperDetails();
		
		d3.display();
		d3.displayDeveloperDetails();
		
		//create a parent class object
		
		employee employee1=new employee(123, "micheal jackson", 67000);
		employee employee2=new employee(456, "Hairy smith", 78000);
		
		employee1.display();
		employee2.display();
	}
}

