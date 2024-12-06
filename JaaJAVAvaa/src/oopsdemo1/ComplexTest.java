package oopsdemo1;

/**
* Auhtor : Satyam.3.Singh
* Date   : 26 Oct 2024
* Time   : 3:06:25 pm
* Email  : satyam.3.singh@coforge.com
*/

public class ComplexTest {
	public static void main(String[] args) {
		
		Complex complex1=new Complex(10.3, 67.4);
		Complex	complex2=new Complex(0.7, 3.6);
		
		complex1.add(complex2);
		complex1.display();
		
		Complex complex3=new Complex(11.66, 22.50);
		Complex complex4=new Complex(20.20, 30.60);
		
		complex3.add(complex4);
		complex3.display();
		
	}
}
