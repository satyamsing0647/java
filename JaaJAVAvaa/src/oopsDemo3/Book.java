package oopsDemo3;

/**
* Auhtor : Satyam.3.Singh
* Date   : 29 Oct 2024
* Time   : 3:28:28 pm
* Email  : satyam.3.singh@coforge.com
*/

public class Book extends Item{
	private String author;

	public Book(String name, int price, String author) {
		super(name, price);
		this.author = author;
	}

	@Override
	void display() {
		super.display();
		System.out.println("Author       : "+author);
	}
	
}
