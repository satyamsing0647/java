package logicBuilding;

/**
* Auhtor : Satyam.3.Singh
* Date   : 29 Oct 2024
* Time   : 10:51:45 pm
* Email  : satyam.3.singh@coforge.com
*/

public class Book {
	
	private String title;
	private String author;
	private double price;
	
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	

	public String getAuthor() {
		return author;
	}


	public double getPrice() {
		return price;
	}


	public void displayDetails() {
		System.out.println("Title: " + title+", Author: "+author+", Price :"+price);
	}
	
	
}
