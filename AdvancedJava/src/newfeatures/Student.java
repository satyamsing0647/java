package newfeatures;

/**
* Auhtor : Satyam.3.Singh
* Date   : 8 Nov 2024
* Time   : 2:53:03 pm
* Email  : satyam.3.singh@coforge.com
*/

public class Student {
	
	Integer rollNumber;
	String name;
	Double marks;
	
	public Student(Integer rollNumber, String name, double marks) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public Double getMarks() {
		return marks;
	}
	
	
}
