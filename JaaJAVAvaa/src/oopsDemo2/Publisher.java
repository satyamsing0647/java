package oopsDemo2;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 29 Oct 2024
 * Time   : 10:15:55 am
 * Email  : satyam.3.singh@coforge.com
 */

//Aggregation example 

public class Publisher {

	String name;
	String publisherID;
	String city;
	
	public Publisher(String name, String publisherID, String city) {
		this.name = name;
		this.publisherID = publisherID;
		this.city = city;
		
		
	}

	@Override
	public String toString() {
		return "Publisher [name=" + name + ", publisherID=" + publisherID + ", city=" + city + "]";
	}

	
}
