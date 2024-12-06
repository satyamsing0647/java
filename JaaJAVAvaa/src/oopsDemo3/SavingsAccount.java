package oopsDemo3;

/**
* Auhtor : Satyam.3.Singh
* Date   : 29 Oct 2024
* Time   : 3:40:50 pm
* Email  : satyam.3.singh@coforge.com
*/

public class SavingsAccount extends Account{
	
	private double intrestRate;

	public SavingsAccount(String name, double balance, double intrestRate) {
		super(name, balance);
		this.intrestRate = intrestRate;
	}

	public double getIntrestRate() {
		return intrestRate;
	}
	
}
