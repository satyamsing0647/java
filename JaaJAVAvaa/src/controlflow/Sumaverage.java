package controlflow;
import java.util.Scanner;
/*
 * sum and average of 3 numbers which are greater than 100
 */

public class Sumaverage {
	public static void main(String[] args) {
		int a,b,c,sum;
		float avg;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter three numebers : "); 
		// sysout ---> ctrl+space (shortcut)
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		
		// condition
		
		if (a > 100 && b > 100 && c > 100) {
			sum=a+b+c;
			avg= (float) sum/3;
			System.out.println("the sum of the 3 numbers is :" + sum);
			System.out.println("the avg of the 3 numbers is :" + avg);
			System.out.println("the avg of the 3 numbers is : " + String.format("%.3f",avg));
			
		}
		
		else {
			if (a < 100) {
				System.out.println("please enter 'a' greater than 100");
			}
			else if (b < 100) {
				System.out.println("please enter 'b' greater than 100");
			}
			else if ( c < 100) {
				System.out.println("please enter 'c' greater than 100");
			}
			
		}
		scanner.close();

		
	}

}
