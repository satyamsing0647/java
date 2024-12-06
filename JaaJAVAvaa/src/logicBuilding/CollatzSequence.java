package logicBuilding;

import java.util.Scanner;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 4 Nov 2024
 * Time   : 12:08:36 am
 * Email  : satyam.3.singh@coforge.com
 */

public class CollatzSequence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter n value: ");
		long n = scanner.nextLong();

		while (n != 1) {
			System.out.println(n);
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = 3 * n + 1;
			}
		}

		System.out.println(1); // Print the final 1
		scanner.close();
	}
}
