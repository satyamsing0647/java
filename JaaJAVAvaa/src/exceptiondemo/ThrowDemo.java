package exceptiondemo;

/**
* Auhtor : Satyam.3.Singh
* Date   : 6 Nov 2024
* Time   : 3:27:06 pm
* Email  : satyam.3.singh@coforge.com
*/

public class ThrowDemo {
	
	public static void test(int a) {
		if(a==0)
			throw new ArithmeticException("Pass Non Zero Values: by Raj");
		else
			System.out.println("The Value Passed to Method is :"+a);
	}
	
	public static void main(String[] args) {
		
		ThrowDemo.test(250);
		ThrowDemo.test(0);
	}
}
