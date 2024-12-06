package oopsDemo2;

/**
* Auhtor : Satyam.3.Singh
* Date   : 29 Oct 2024
* Time   : 11:39:24 am
* Email  : satyam.3.singh@coforge.com
*/

public class Book {
	String title,author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	
}
