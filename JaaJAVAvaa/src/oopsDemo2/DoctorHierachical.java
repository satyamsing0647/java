package oopsDemo2;

/**
* Auhtor : Satyam.3.Singh
* Date   : 28 Oct 2024
* Time   : 2:40:06 pm
* Email  : satyam.3.singh@coforge.com
*/

public class DoctorHierachical {
public static void main(String[] args) {
		
		SpecialistDoctor specialistDoctor=new SpecialistDoctor(10001,"Mary King","Bengaluru","Cardiologist");
 
		NonSpecialist nonSpecialistDoctor=new NonSpecialist(20001,"Gavin King","Melbourne");
 
		specialistDoctor.display();
		nonSpecialistDoctor.display();
	}
}
