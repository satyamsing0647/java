package Assignments;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 27 Oct 2024
 * Time   : 11:14:30 pm
 * Email  : satyam.3.singh@coforge.com
 */

public class hourlyemployee {

		private double salary;
		private int hoursPerDay;

		// Constructor to initialize salary and hours per day
		public hourlyemployee(double salary, int hoursPerDay) {
			this.salary = salary;
			this.hoursPerDay = hoursPerDay;
		}

		// Method to add 10 to salary if it is less than 500
		public void addSalary() {
			if (salary < 500) {
				salary += 10;
			}
		}

		// Method to add $5 to salary if hours per day are more than 6
		public void addWork() {
			if (hoursPerDay > 6) {
				salary += 5;
			}
		}

		// Method to print the final salary
		public void printSalary() {
			System.out.println("Final salary: $" + salary);
		}
	}

