package logicBuilding;

import java.util.Scanner;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 3 Nov 2024
 * Time   : 11:58:08 pm
 * Email  : satyam.3.singh@coforge.com
 */

public class FizzBuzz {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer n (1 <= n <= 1000): ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

		scanner.close();
	}
}

