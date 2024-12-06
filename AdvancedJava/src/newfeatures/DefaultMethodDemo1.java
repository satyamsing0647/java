package newfeatures;

import java.time.LocalDate;

/**
* Auhtor : Satyam.3.Singh
* Date   : 9 Nov 2024
* Time   : 11:20:46 am
* Email  : satyam.3.singh@coforge.com
*/
// java8 allows to add functionality to interfaces

interface Parser{
	default void parse() {
		System.out.println("Default parsing logic");
	}
	static void displayDate() {
		System.out.println(LocalDate.now());
	}
	
	//void test();
}

class TextParser implements Parser{
	void display() {
		System.out.println("Hello Text Parser");
	}
}

class XMLParser implements Parser{
	
	public void parse() {
		System.out.println("Parsing XML files");
	}
}
public class DefaultMethodDemo1 {
	
	public static void main(String[] args) {
		
		Parser p=new TextParser();
		p.parse();
		
		TextParser p1=new TextParser();
		p1.display();
		
		XMLParser xp1=new XMLParser();
		xp1.parse();
		
		System.out.println("program executed on : ");
		Parser.displayDate();
	}
}
