package oopsDemo4;

/**
* Auhtor : Satyam.3.Singh
* Date   : 30 Oct 2024
* Time   : 12:56:00 pm
* Email  : satyam.3.singh@coforge.com
*/

public class LibrarySystem {
	public static void main(String[] args) {
		
		Library library=new Library();
		
		library.displayItems();
		library.borrowItem("1984");
		library.borrowItem("The Great Gatsby");
		library.returnItem("1984");
		
		library.displayItems();
	}
}
