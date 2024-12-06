package oopsDemo2;

/**
* Auhtor : Satyam.3.Singh
* Date   : 28 Oct 2024
* Time   : 10:26:49 am
* Email  : satyam.3.singh@coforge.com
*/

//Child class of Employee

public class developer extends employee{
	
	private String tech;
	
	public developer(int empId, String name,float basic,String tech) {
		super(empId, name, basic);
		this.tech=tech;
	}
	public void displayDeveloperDetails() {
		System.out.println("Technology  :"+this.tech);
		System.out.println("************************");
	}

}
