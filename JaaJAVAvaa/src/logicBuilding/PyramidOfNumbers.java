package logicBuilding;

import java.util.Scanner;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 4 Nov 2024
 * Time   : 12:03:35 am
 * Email  : satyam.3.singh@coforge.com
 */

public class PyramidOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			
			//printing leading spaces
			
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}

			//printing increasing numbers
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			//printing decreasing numbers
			
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}

			//move to the next line after each row
			
			System.out.println();
		}

		scanner.close();
	}
}
