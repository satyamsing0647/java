package basic;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		String customerName;
		double principal;
		float si;
		int term,rate;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("************ soft bank - simpleintrest calculations**********");
		System.out.println("enter customer name: ");
		customerName=scan.nextLine();
		System.out.println("enter loan amount : ");
		principal=scan.nextDouble();
		System.out.println("enter loan term : ");
		term=scan.nextInt();
		System.out.println("enter rate of intrest : ");
		rate=scan.nextInt();
		
		si=(float) (principal*term*rate)/100;
		System.out.println("********** Loan Details ************");
		System.out.println("Customer Name " + customerName);
		System.out.println("principal amonunt "+principal);
		System.out.println("term "+term);
		System.out.println("Rate of intrest "+rate);
		System.out.println("----------------------------------");
		System.out.println("Simple Intrest "+si);
		System.out.println("----------------------------------");
		
		scan.close();
	}

}

