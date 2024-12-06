package oopsdemo1;

/**
* Auhtor : Satyam.3.Singh
* Date   : 26 Oct 2024
* Time   : 4:24:46 pm
* Email  : satyam.3.singh@coforge.com
*/

public class LanguageTest {
	public static void main(String[] args) {
		
		Languages l1=new Languages();
		Languages l2=new Languages("Scala");
		Languages l3=new Languages("Ruby");
		
		Languages l4=new Languages(3.5f);
		
		Languages l5=new Languages("c#",9.0f);
		Languages l6=new Languages("Swift",5.2f);
	}
}
