package oopsDemo3;

import oopsdemo1.Complex;

/**
* Auhtor : Satyam.3.Singh
* Date   : 30 Oct 2024
* Time   : 9:52:34 am
* Email  : satyam.3.singh@coforge.com
*/

class Test{
	int a; // default variable - accessible within the package
	private int b; //private variable - accessible within class only
	protected int c; // accessible in class & subclass
	public int d; //accessible from any part of the project
	
	public Test(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	void display(){ // default method
		System.out.println("Private Variable : "+b);
	}	
	
}

class Test2 extends Test{

	public Test2(int a, int b, int c, int d) {
		super(a, b, c, d);
	}
	
	void display(){ // default method
		System.out.println("Protected Variable : "+c);
	}	
	
}
public class AccessSpecifiersDemo {
	public static void main(String[] args) {
		
		Test t1=new Test(100, 200, 300, 400);
		t1.display();
		
		System.out.println("The Default Variable Value in new class : "+t1.a);
		
		Test2 test2=new Test2(300, 400, 500, 600);
		test2.display();
		
		Complex complex1=new Complex(10.3, 67.4);
		Complex complex2=new Complex(0.7, 3.6);
		
		complex1.add(complex2);
		complex1.display();
	}
}
