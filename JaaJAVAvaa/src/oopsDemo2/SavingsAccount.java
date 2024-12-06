package oopsDemo2;

/**
* Auhtor : Satyam.3.Singh
* Date   : 28 Oct 2024
* Time   : 12:06:25 pm
* Email  : satyam.3.singh@coforge.com
*/

public class SavingsAccount extends Account{
	private float minimumBalance;
	protected double balance;
	
	
	public SavingsAccount(int accountNumber, String name, float minimumBalance, double balance) {
	super(accountNumber, name);
	this.minimumBalance = minimumBalance;
	this.balance = balance;
}


	
    public void display() {
        super.display();
        System.out.println("Minimum Balance           : "+minimumBalance);
        System.out.println("Savings account Balance   : "+balance);
    }
	
	
}
