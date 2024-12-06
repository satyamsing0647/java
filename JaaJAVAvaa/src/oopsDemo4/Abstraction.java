package oopsDemo4;

/**
* Auhtor : Satyam.3.Singh
* Date   : 30 Oct 2024
* Time   : 11:40:33 am
* Email  : satyam.3.singh@coforge.com
*/

public class Abstraction {
	public static void main(String[] args) {
		Training trainee1=new Marks("John Micheal", "New York",10001,44);
		System.out.println(trainee1);
		
		double result = trainee1.calculateMarks();
		System.out.println("Final Marks : "+result);
	}
}
