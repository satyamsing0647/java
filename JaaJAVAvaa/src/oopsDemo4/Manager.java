package oopsDemo4;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 30 Oct 2024
 * Time   : 11:49:02 am
 * Email  : satyam.3.singh@coforge.com
 */

public class Manager extends Employee {
	private String department;

	public Manager(String name, double basic, String address, String department) {
		super(name, basic, address);
		this.department = department;
	}

	@Override
	double totalPay() {

		double totalAmount = 0;
		double houseRentAllowance = (basic * 0.08);
		double dearnessAllowance = (basic * 0.3);
		double medicalAllowance = 1500;
		totalAmount = basic + houseRentAllowance
				+ dearnessAllowance + medicalAllowance;
		return totalAmount;
	}
	
	void show() {
		super.show();
		System.out.println("Department: \t\t" + department);
	}

}
