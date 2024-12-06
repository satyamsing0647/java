package stringsDemo;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 30 Oct 2024
 * Time   : 4:53:02 pm
 * Email  : satyam.3.singh@coforge.com
 */

public class StringCreationDemo3 {
	public static void main(String[] args) {

		// Creates a empty String. Creates an Object of class String
		String s1 =new String();

		System.out.println("Empty String :"+s1);

		String s2=new String("Hello World");
		System.out.println("String Object s2 :"+s2);

		char arr[]= {'j','a','c','k',' ','j','i','l'};
		String s3=new String(arr);
		System.out.println("String Object from char Array : "+s3);

		String s4=new String(arr,2,5); //Create String from subsequence of an Array
		System.out.println("String from subsequence of an Array :"+s4);

		String s5=new String(s3);
		System.out.println("String with Object of another String :"+s5);

		String s6="Java is Fun";
		System.out.println("String Literal : "+s6);

		System.out.println("**********************");
		/*String a=null;
	System.out.println(a.length()); // Edge case : Null Pointer exception*/

		String b ="Hello",c="World";
		String d=b.concat(c);
		System.out.println(d +" "+d.length());
		// System.out.println(d.substring(1,12)); // Edge Case - Range Out of Bounds
		System.out.println(d.substring(1,6));
	}
}
