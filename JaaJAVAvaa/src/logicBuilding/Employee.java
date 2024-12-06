package logicBuilding;

/**
* Auhtor : Satyam.3.Singh
* Date   : 30 Oct 2024
* Time   : 12:12:14 am
* Email  : satyam.3.singh@coforge.com
*/

public class Employee {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}


	public String getDetails() {
		return "Name: " + name + ", Salary: " + salary;
	}


}
