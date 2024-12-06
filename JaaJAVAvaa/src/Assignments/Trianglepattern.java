package Assignments;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 28 Oct 2024
 * Time   : 1:27:26 am
 * Email  : satyam.3.singh@coforge.com
 */

public class Trianglepattern {
	public static void main(String[] args) {
		for (int i=1; i <=5; i++) {
			for(int j =1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=4; i >=1; i--) {
			for(int j =1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
