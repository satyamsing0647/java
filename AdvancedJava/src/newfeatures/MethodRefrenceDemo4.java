package newfeatures;

/**
* Auhtor : Satyam.3.Singh
* Date   : 9 Nov 2024
* Time   : 10:40:09 am
* Email  : satyam.3.singh@coforge.com
*/

//Java program to use Method Reference to a Constructor
interface IMessage
{
	ConstructorReference getMessage(String msg);
}

class ConstructorReference
{
	ConstructorReference(String msg)
	{
		System.out.println(msg);
	}
}
public class MethodRefrenceDemo4 {
	
	public static void main(String[] args) {
		
		IMessage hello  =ConstructorReference::new;
		hello.getMessage("Method refrence to constructor");
		
		ConstructorReference a=new ConstructorReference("Hello");
	}
}
