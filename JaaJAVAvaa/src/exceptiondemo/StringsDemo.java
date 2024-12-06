package exceptiondemo;

/**
* Auhtor : Satyam.3.Singh
* Date   : 6 Nov 2024
* Time   : 2:51:18 pm
* Email  : satyam.3.singh@coforge.com
* 
* program to handle Null Pointer Exception

*/

public class StringsDemo {
	public static void main(String[] args) {
		
		String s1="Hello World";
        String s2=null;
       // String s2="Java";
        try{
            System.out.println(s1.length());
            System.out.println(s2.length());
        }
        catch (Exception exception){ //general exception handeling
            System.err.println("Exception occurred:"+exception);
        }
	}
}
