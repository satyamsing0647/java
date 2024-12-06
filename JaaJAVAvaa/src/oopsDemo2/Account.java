package oopsDemo2;

/**
* Auhtor : Satyam.3.Singh
* Date   : 28 Oct 2024
* Time   : 12:04:20 pm
* Email  : satyam.3.singh@coforge.com
*/

public class Account {
	private int accountNumber;
	private String name;
	
	public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
    public void display() {
        System.out.println("********** Account Details ***********");
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Customer Name  :"+name);
    }
	
	
}
