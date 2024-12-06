package newfeatures;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 9 Nov 2024
 * Time   : 10:00:04 am
 * Email  : satyam.3.singh@coforge.com
 */


//Program to demonstrate Method reference to an instance method of a class

@FunctionalInterface
interface IDemo
{
	void sum(int  x,int y);
}

class Calculation
{
	void addition(int  a,int b)
	{
		System.out.println("The Addition is : "+(a+b));
	}
}
public class MethodRefrenceDemo2 {

	public static void main(String[] args) {

		Calculation c1=new Calculation();
		
		//using lambda expressions
		IDemo d1=(a,b) -> System.out.println("The addition is : "+(a+b));
		d1.sum(10, 45);
		
		//using metjod refrence to call instance method
		
		IDemo d2=c1::addition;
		d2.sum(200, 150);
	}
}
