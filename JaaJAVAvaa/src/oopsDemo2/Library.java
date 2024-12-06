package oopsDemo2;

import java.util.List;

/**
* Auhtor : Satyam.3.Singh
* Date   : 29 Oct 2024
* Time   : 11:41:16 am
* Email  : satyam.3.singh@coforge.com
*/

public class Library {
	private List<Book> books; // Composition - Library has book refrenece Object

	public Library(List<Book> books) {
		this.books = books;
	}

	//generate getter method
	
	public List<Book> getBooks() {
		return books;
	}
	
		
	
}
