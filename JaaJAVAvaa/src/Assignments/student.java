package Assignments;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 27 Oct 2024
 * Time   : 11:18:31 pm
 * Email  : satyam.3.singh@coforge.com
 */

public class student {
		// Private fields for encapsulation
		private String name;
		private int yearOfJoining;
		private double salary;
		private String address;

		// Constructor to initialize the student object
		public student(String name, int yearOfJoining, double salary, String address) {
			this.name = name;
			this.yearOfJoining = yearOfJoining;
			this.salary = salary;
			this.address = address;
		}

		// Getter methods for accessing private fields
		public String getName() {
			return name;
		}

		public int getYearOfJoining() {
			return yearOfJoining;
		}

		public double getSalary() {
			return salary;
		}

		public String getAddress() {
			return address;
		}

		// Method to display student information
		public void displayInfo() {
			System.out.printf("%-10s %-15d %-10s %-15s%n", name, yearOfJoining, salary, address);
		}
	}

