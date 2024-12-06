package oopsdemo1;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 25 Oct 2024
* Time   : 4:12:58 pm
* Email  : satyam.3.singh@coforge.com
*/
//Instance class - implemented Encapsulation
public class Student {
	
	//define properties/state/attributes
	private int rollNumber;
	private String firstName, lastName;
	private float[] marks=new float[5];
	private float total;
	
	Scanner scan=new Scanner(System.in);
	
	//define methods or behaviour/actions
	
	public void inputStudentDetails() {
		System.out.println("Enter Roll Number of a Student :");
		rollNumber=scan.nextInt();
		System.out.println("Enter The First Name and The Last Name of a Student :");
		firstName=scan.next();
		lastName=scan.next();
		
		System.out.println("Enter Marks of 5 Subjects :");
		for (int i=0; i < marks.length;i++) {
			marks[i]=scan.nextFloat();
		}
		
	}
	public float calculateTotalMakrs() {
		for (int i=0; i < marks.length;i++) {
			total+=marks[i];
		}
		return total;
	}
	
	public void displayStudentDetails() {
		System.out.println("******** Studen Result Information **********");
		System.out.println("Roll Number            : "+rollNumber);
		System.out.println("Student Name           : "+firstName+" "+lastName);
		System.out.println("Total Marks            : "+total);
		System.out.println("**********************************************");
	}
	
}
