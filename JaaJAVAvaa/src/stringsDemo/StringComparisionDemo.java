package stringsDemo;

/**
* Auhtor : Satyam.3.Singh
* Date   : 4 Nov 2024
* Time   : 12:09:28 pm
* Email  : satyam.3.singh@coforge.com
*/

public class StringComparisionDemo {

		public static void main(String[] args) {
			
			
			String s1="James Gosling";
			//String s2="James gosling";
			String s2="James Gosling";

			
			String s3=new String("Hello World");
			String s4=new String("Hello World");

			
			if (s1==s2) {    // == operator checks wether string points to same refrence
				System.out.println("Strings are equal");
			}
			else {
				System.out.println("Strings are Not Equal");
			}
			
			//no need of flower brackets when there is only 1 sentence
			
			if (s3.equals(s4))    // equals() method checks wether Strings are equal 
				System.out.println("Strings are equal");
			else 
				System.out.println("Strings are Not Equal");
			
		}
}
