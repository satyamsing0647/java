package newfeatures;

/**
* Auhtor : Satyam.3.Singh
* Date   : 8 Nov 2024
* Time   : 12:25:01 pm
* Email  : satyam.3.singh@coforge.com
*/

public class LambdaDemo1 {
	
	public static void main(String[] args) {
		
		NumericTest isEven=(n) -> (n%2==0);
		NumericTest isNegative=(n) -> (n<0);

		System.out.println("7 is Even number : "+isEven.computeTest(7));
		System.out.println("-55 is a Negative number : "+isNegative.computeTest(-55));
		
		//boolean a=(n) -> (n%2==0); //error - lambda expressions should be stored in instance of FI
	}
}
