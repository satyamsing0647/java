package oopsDemo4;

/**
* Auhtor : Satyam.3.Singh
* Date   : 30 Oct 2024
* Time   : 3:00:29 pm
* Email  : satyam.3.singh@coforge.com
*/

public class College {
	
	String name;
	int id;
	String universty;
	String course;
	

	public College(String name, int id, String universty, String course) {
		this.name = name;
		this.id = id;
		this.universty = universty;
		this.course = course;
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getUniversty() {
		return universty;
	}

	public String getCourse() {
		return course;
	}

	
}
