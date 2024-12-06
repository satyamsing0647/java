package packagedemo;

/**
* Auhtor : Satyam.3.Singh
* Date   : 4 Nov 2024
* Time   : 4:52:00 pm
* Email  : satyam.3.singh@coforge.com
*/

public class ObjectClassDemo {
	
	public static void main(String[] args) {
		
		Person p1=new Person("Satyam", 22);
		Person p2=new Person("Satyam", 22);
		
		Person p3=new Person("Shiva",69);
		
		System.out.println("Person 1 : "+p1.toString());
		System.out.println("person 3 : "+p3);
		
		System.out.println("Person1 equals Person2 : "+p1.equals(p2));
		System.out.println("Person2 equals Person3 : "+p2.equals(p3));
		
		System.out.println("Person 1 Hash Code : "+p1.hashCode());
		System.out.println("Person 2 Hash Code : "+p2.hashCode());
		System.out.println("Person 3 Hash Code : "+p3.hashCode());
		
		System.out.println("Class of person 1 : "+p1.getClass().getName());




	}
}
