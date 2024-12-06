package oopsDemo2;

/**
* Auhtor : Satyam.3.Singh
* Date   : 28 Oct 2024
* Time   : 2:39:05 pm
* Email  : satyam.3.singh@coforge.com
*/

public class SpecialistDoctor extends Doctor {
	private String speciality;
	
	 
	public SpecialistDoctor(int idNumber, String name, String address,String speciality) {
		super(idNumber, name, address);
		this.speciality=speciality;
		
		
	}
	
	public void display() {
		super.display();
		System.out.println("the speciality is:" +speciality);
	}
 
}
 
 
class NonSpecialist extends Doctor{
 
	public NonSpecialist(int idNumber, String name, String address) {
		super(idNumber, name, address);
	}
}
