package Assignments;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 28 Oct 2024
 * Time   : 12:05:35 am
 * Email  : satyam.3.singh@coforge.com
 */

public class bankAccount {
	private String accountHolderName;
	private double balance;

	// Constructor to initialize the account holder name and initial balance
	public bankAccount(String accountHolderName, double initialBalance) {
		this.accountHolderName = accountHolderName;
		this.balance = (initialBalance >= 0) ? initialBalance : 0; // Ensure initial balance is non-negative
	}

	// Method to deposit money into the account
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: $" + amount);
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}

	// Method to withdraw money from the account
	public void withdraw(double amount) {
		if (amount > 0) {
			if (amount <= balance) {
				balance -= amount;
				System.out.println("Withdrawn: $" + amount);
			} else {
				System.out.println("Insufficient funds for withdrawal.");
			}
		} else {
			System.out.println("Withdrawal amount must be positive.");
		}
	}

	// Method to display account details
	public void displayAccountInfo() {
		System.out.printf("Account Holder: %s%n", accountHolderName);
		System.out.printf("Current Balance: $%.2f%n", balance);
	}
}

