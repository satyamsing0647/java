package oopsDemo2;

/**
* Auhtor : Satyam.3.Singh
* Date   : 28 Oct 2024
* Time   : 11:35:13 am
* Email  : satyam.3.singh@coforge.com
*/

public class customer {
	private String name;
	private String email;
	
	public customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
	 public void display(){
	        System.out.println("********** Customer Details ************");
	        System.out.println("Customer Name    : "+name);
	        System.out.println("Email            : "+email);
	    }
	
}
