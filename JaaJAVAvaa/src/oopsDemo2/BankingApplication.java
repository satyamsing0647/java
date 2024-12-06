package oopsDemo2;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 28 Oct 2024
* Time   : 12:21:35 pm
* Email  : satyam.3.singh@coforge.com
*/

public class BankingApplication {
	public static void main(String[] args) {
		
	
	 Scanner scanner=new Scanner(System.in);
     System.out.println("********** Welcome to Soft Bank ************");

     System.out.println("Enter Account Number & Customer Name:");
     int accountNumber=scanner.nextInt();
     String name=scanner.nextLine();

     //Constant declaration
     final float MIN_BAL=1000;
     final double BALANCE=5000; // Initial Balance while creating SavingsAccount

     System.out.println("Enter Amount to be Deposited : ");
     double deposit=scanner.nextDouble();
     System.out.println("Enter Amount to Withdrawal :");
     double withdrawal=scanner.nextDouble();

     //Create Object of AccountTransactions
     AccountsTransactions transactions1,transactions2;

     transactions1=new AccountsTransactions(accountNumber,name,MIN_BAL,BALANCE,withdrawal,deposit);
     transactions2 =new AccountsTransactions(9999,"Mary Smith",MIN_BAL,BALANCE,7000,5000);

     transactions1.display();
     transactions2.display();
     scanner.close();
}}
