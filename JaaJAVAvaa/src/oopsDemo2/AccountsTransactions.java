package oopsDemo2;

/**
* Auhtor : Satyam.3.Singh
* Date   : 28 Oct 2024
* Time   : 12:09:46 pm
* Email  : satyam.3.singh@coforge.com
*/

public class AccountsTransactions extends SavingsAccount{
	private double withdrawal,deposit,finalBalance;

	public AccountsTransactions(int accountNumber, String name, float minimumBalance, double balance, double withdrawal,
			double deposit) {
		super(accountNumber, name, minimumBalance, balance);
		this.withdrawal = withdrawal;
		this.deposit = deposit;
	}
	public void display()
    {
        super.display();
        System.out.println("Deposit Amount    : "+deposit);
        System.out.println("Withdrawal Amount : "+withdrawal);
        finalBalance=(balance+deposit)-withdrawal;
        System.out.println("Final Balance     : "+finalBalance);
    }
	
	}	
	
	

