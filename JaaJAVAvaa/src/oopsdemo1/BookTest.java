package oopsdemo1;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 26 Oct 2024
* Time   : 12:13:58 pm
* Email  : satyam.3.singh@coforge.com
* 
* Program to demonstrate Encapsulation using Setter() & Getter() methods
*/

public class BookTest {
public static void main(String[] args) {
	book book1 = new book();
	book book2 = new book();
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter Book Id, Name, Price, Publisher : ");
	
	// instead of getting data type from the scan method we are already intialising from the setter method
	
	int bookId=scanner.nextInt();
	scanner.nextLine();
	String bookName=scanner.nextLine();
	float price=scanner.nextFloat();
	scanner.nextLine();
	String publisher=scanner.nextLine();
	
	//Invoke Setter() methods -- Input from user
	book1.setBookId(bookId);
	book1.setBookName(bookName);
	book1.setPrice(price);
	book1.setPublisher(publisher);
	
	//Invoke getter() methods --Output 
	System.out.println("************* Book1 Details *************");
	System.out.println(book1.getBookId()+" \""+book1.getBookName()+"\" \""+book1.getPublisher()+"\" "+book1.getPrice());
	System.out.println("The Discount Price is : "+book1.calculateDiscountPrice());

	//Set static values for book2
	//Invoke Setter() methods -- Input
	book2.setBookId(9999);
	book2.setBookName("Python Programming");
	book2.setPrice(750.75f);
	book2.setPublisher("Prime Publishers");
	
	//Invoke getter() methods --Output
	System.out.println("************* Book2 Details ************");
	System.out.println("Book Id        : "+book2.getBookId());
	System.out.println("Book Name      : "+book2.getBookName());
	System.out.println("Book Price     : "+book2.getPrice());
	System.out.println("Publisher      : "+book2.getPublisher());
	System.out.println("Discount Price : "+book2.calculateDiscountPrice()); //Invoke user-defined method
	System.out.println("########################################");
	
	System.out.println();
	//Display Object properties using toString() Method
	//If toString() Method is not present in Book class, it will print reference(hash code) 
	//of Book Objects
	System.out.println(book1); //invokes toString() Method of Book class
	System.out.println(book2);  // if no 'toSting' then it gives back the memory allocation of where the objects are stored
	
	scanner.close();
}
}
