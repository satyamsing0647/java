package collectionsdemo;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 5 Nov 2024
 * Time   : 2:52:26 pm
 * Email  : satyam.3.singh@coforge.com
 */

public class Book {

	//Class for Storing Book Object in ArrayList


	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getQuantity() {
		return quantity;
	}
	
	
}
