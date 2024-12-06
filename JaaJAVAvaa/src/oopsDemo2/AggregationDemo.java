package oopsDemo2;

/**
* Auhtor : Satyam.3.Singh
* Date   : 29 Oct 2024
* Time   : 10:08:21 am
* Email  : satyam.3.singh@coforge.com
*/

public class AggregationDemo {
	public static void main(String[] args) {
		
		Address ad1=new Address("Bengaluru", "Karnataka", "India", 566016);
		Address ad2=new Address("prague", "Austin", "czech Republic", 777777);
		
		Student s1=new Student(101, "Ravi Kumar", ad1);
		Student s2=new Student(102, "Mike Daniel", ad2);
		
		s1.display();
		s2.display();
	}
}
