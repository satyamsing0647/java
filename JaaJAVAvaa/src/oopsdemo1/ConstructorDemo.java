package oopsdemo1;

/**
* Auhtor : Satyam.3.Singh
* Date   : 26 Oct 2024
* Time   : 2:36:02 pm
* Email  : satyam.3.singh@coforge.com
*/

public class ConstructorDemo {
	
	int id;
	String name;
	float salary;
	
	//no-arg constructor
	
	public ConstructorDemo() {
		System.out.println("No-Args/Implicit Construction");
		this.id=101;
		this.name="satyam";
		this.salary=50000.00f;
		
	}
	//parameterised contrsuctor
	public ConstructorDemo(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void name() {
		System.out.println("I am a method");
		System.out.println(this.id+" "+this.name+" "+this.salary);
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo cd1=new ConstructorDemo(1002,"satyam",29000000);//invokes parameterised constructed
		ConstructorDemo cd2=new ConstructorDemo();// invokes non-arg constructor
		
		cd1.name();
		cd2.name();
	}
	
}
