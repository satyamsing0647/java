package oopsdemo1;

/**
* Auhtor : Satyam.3.Singh
* Date   : 25 Oct 2024
* Time   : 4:39:04 pm
* Email  : satyam.3.singh@coforge.com
*/

public class StudentTest {
public static void main(String[] args) {
	
	//create student objects
	Student s1=new Student();
	Student s2=new Student();
	Student s3=new Student();
	
	//invoke instance class menthods using dot operator
	s1.inputStudentDetails();
	s2.inputStudentDetails();
	s3.inputStudentDetails();

	float tot1=s1.calculateTotalMakrs();
	float tot2=s2.calculateTotalMakrs();
	float tot3=s3.calculateTotalMakrs();
	
	s1.displayStudentDetails();
	System.out.println("Display total marks returned to main : "+tot1);
	s2.displayStudentDetails();
	System.out.println("Display total marks returned to main : "+tot2);
	s3.displayStudentDetails();
	System.out.println("Display total marks returned to main : "+tot3);
}
}
