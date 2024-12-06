package newfeatures;

/**
* Auhtor : Satyam.3.Singh
* Date   : 8 Nov 2024
* Time   : 12:37:11 pm
* Email  : satyam.3.singh@coforge.com
*/

public interface LambdaDemo2 {
	
	public static void main(String[] args) {
		
		MyString reverseStr=(str) -> {
			String result="";
			for (int i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		};
		
		System.out.println(reverseStr.myStringFunction("Lambda Expressions"));
		System.out.println(reverseStr.myStringFunction("madam"));
		System.out.println(reverseStr.myStringFunction("Hello World Java"));
		
		MyString myName=(name) -> { return "Hello "+name; };
		System.out.println(myName.myStringFunction("Satyam"));
		
		MyString myname=(name) -> { return "Hello "+name; };
		System.out.println(myname.myStringFunction("James Gosling"));
		
		MyString str=(stri) -> { return "The length of string"+stri+" is :"+stri.length(); };
		System.out.println(str.myStringFunction("hello world"));
		System.out.println(str.myStringFunction("James Gosling"));

	}
}
