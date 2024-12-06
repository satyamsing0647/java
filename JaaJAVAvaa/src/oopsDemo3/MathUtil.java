package oopsDemo3;

/**
* Auhtor : Satyam.3.Singh
* Date   : 29 Oct 2024
* Time   : 4:51:40 pm
* Email  : satyam.3.singh@coforge.com
* 
* static methods Demo
*/

public class MathUtil {
	
	public static int square(int num) {
		
		return num*num;
	}
	public static int myAddittion(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		
		int result=MathUtil.square(5);
		
		System.out.println("The square of a number is : "+result);
		
		System.out.println("The addition of 2 numbers is : "+MathUtil.myAddittion(400, 120));
	}
}
