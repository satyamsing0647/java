package oopsDemo4;

/**
* Auhtor : Satyam.3.Singh
* Date   : 30 Oct 2024
* Time   : 3:05:20 pm
* Email  : satyam.3.singh@coforge.com
*/

public class StudentDetails implements CollegeData,HostelData{

	College c1=new College("satyam", 500, "Coforge", "MCA");
	
	Hostel h1=new Hostel("Ram", "Block A");
	@Override
	public void hostelDetail() {
		System.out.println("********** Hostel Details *********");
		System.out.println("Hostel Name :"+h1.getName());
		System.out.println("Location    :"+h1.getLocation());
	}

	@Override
	public void studentRecord() {
	    System.out.println("Students Selected based on Percentage & Financial Condition");
		
	}

	@Override
	public void collegeDetails() {
		System.out.println("********** College Details *********");
		System.out.println("College Name : "+c1.getName());
		System.out.println("College Id   : "+c1.getId());
	//	System.out.println("Course       : "+c1.getCourse());
		System.out.println("University   : "+c1.getUniversty());			
	}

	@Override
	public void studentData() {
	    System.out.println("Students can Join courses : MCA, MTech, BCA,BTech");		
	}

}
