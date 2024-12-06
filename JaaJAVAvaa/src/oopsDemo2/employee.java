package oopsDemo2;

/**
* Auhtor : Satyam.3.Singh
* Date   : 28 Oct 2024
* Time   : 10:15:54 am
* Email  : satyam.3.singh@coforge.com
*/

public class employee {
	private int empId;
	private String name;
	private float basic;
	
	public employee(int empId, String name, float basic) {
		this.empId=empId;
		this.name=name;
		this.basic=basic;
	}
	public void display() {
		System.out.println("*********** Employee Information **********");
		System.out.println("Employee ID          :"+empId);
		System.out.println("Employee name        :"+name);
		System.out.println("Basic Salary         :"+basic);

	}
}
