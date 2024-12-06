package newfeatures;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 8 Nov 2024
 * Time   : 3:26:42 pm
 * Email  : satyam.3.singh@coforge.com
 */

//Method Reference - Shorthand of Lambda expression to call method

@FunctionalInterface
interface MyInterface
{
	void myMethod(int a);
}
class Test // instance class
{
	void display(int x) // instance method
	{
		System.out.println("Iam a Instance Method"+x);
	}
}

public class MethodRefrenceDemo1 {
	public static void main(String[] args) {


		//traditional approach
		Test t1=new Test();
		t1.display(100);
		t1.display(23);

		//Java8 Method Reference approach
		MyInterface m1ref=t1::display; // method reference to instance method of Object

		//calling method of FI
		m1ref.myMethod(200);
		m1ref.myMethod(120);

		// Lambda ---> FI
		// MR--- shorthand of Lambda
		//MR -->FI
	}
}