package oopsDemo3;

/**
* Auhtor : Satyam.3.Singh
* Date   : 29 Oct 2024
* Time   : 4:58:45 pm
* Email  : satyam.3.singh@coforge.com
*/

public class Student {
	
	private int rollNo;
	private String name;
	
	private static String organization="VTU";

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public static void organizationChange() {
		organization="Wipro";
		
	}
	//in instance method we can use static variables but cant vice versa
	public void display() {
		
		System.out.println(this.rollNo+" "+this.name+" "+organization);
		
	}
}
