package Assignments;

import java.util.Scanner;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 27 Oct 2024
 * Time   : 11:15:23 pm
 * Email  : satyam.3.singh@coforge.com
 */

public class hourlyemployeetest {
	public class HourlyEmployeeTest {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			// Taking user input for salary and hours per day
			System.out.print("Enter salary: ");
			double salary = scanner.nextDouble();

			System.out.print("Enter hours of work per day: ");
			int hoursPerDay = scanner.nextInt();

			// Creating an Employee object with user input
			hourlyemployee employee1 = new hourlyemployee(salary, hoursPerDay);

			// Adding salary and work
			employee1.addSalary();
			employee1.addWork();

			// Printing the final salary
			employee1.printSalary();

			scanner.close();

		}

	}
}
