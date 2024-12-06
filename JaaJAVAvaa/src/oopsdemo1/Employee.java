package oopsdemo1;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 26 Oct 2024
* Time   : 10:47:32 am
* Email  : satyam.3.singh@coforge.com
* program to enter Employee  details, Calculate Net salary & Display salary slip
*/

//Instance class -- encapsulation - packing attributes and methods in class

public class Employee {
	private int empId;
	private String firstName,lastName,desig;
	private double basic,hra,da,grossSalary,netSalary;
	private static final double TAX=1000;
	
	Scanner scan=new Scanner(System.in);
	
	//Defualt constructor
	
	//define methods
	
	public void inputEmployeeDetails() {
		System.out.println(" Enter EmplyeeId, FirstName, LastName & Designation :");
		empId=scan.nextInt();
		firstName=scan.next();
		lastName=scan.next();
		scan.nextLine();
		desig=scan.nextLine();
		System.out.println("Enter Basic Salary of the Employee : ");
		basic=scan.nextDouble();
	}
	
	public void calculateNetSalary() {
		hra =basic*0.25;
		da=basic*0.15;
		grossSalary= basic+hra+da;
		netSalary=grossSalary - TAX;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("*************** Emplyee salary slip ************");
		System.out.println("Employee Id       : "+empId);
		System.out.println("Emplyee Name      : "+firstName+ " "+lastName );
		System.out.println("Designation       : "+desig);
		System.out.println("Basic             : "+basic);
		System.out.println("hra               : "+hra);
		System.out.println("Da                : "+da);
		System.out.println("grossSalary       : "+grossSalary);
		System.out.println("Tax               : "+TAX);
		System.out.println("---------------------------------------------");
		System.out.println("Net salary is     : "+netSalary);
		System.out.println("---------------------------------------------");

	}

}
