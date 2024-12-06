package newfeatures;

import java.util.Optional;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 9 Nov 2024
 * Time   : 3:36:30 pm
 * Email  : satyam.3.singh@coforge.com
 */

public class OptionalDemo {

	public static void main(String[] args) {

		/*String s=null;
		Integer a=null;

		System.out.println(s.length());*/ // throw Null Pointer Exception

		String s="Hello World";
		//String s=null;
		//Optional object is a container for not null objects
		Optional<String> chkNull=Optional.ofNullable(s);

		if(chkNull.isPresent())
		{
			System.out.println("Length of String is : "+s.length());
			chkNull.ifPresent(System.out::println);
			System.out.println(s.toUpperCase());
			System.out.println(chkNull.get());
		}
		else
		{
			System.out.println("String not Present");
		}
	}
}
