package basic;
import java.util.Scanner;
/*
 * suma and average of 3 numbers
 */

public class Sumaverage {
	public static void main(String[] args) {
		int a,b,c,sum;
		float avg;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter three numebers : "); // sysout ---> ctrl+space (shortcut)
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		sum=a+b+c;
		avg= (float) sum/3;
		
		//output
		
		System.out.println("the sum of the 3 numbers is :" + sum);
		System.out.println("the avg of the 3 numbers is :" + avg);
		System.out.println("the avg of the 3 numbers is : " + String.format("%.3f",avg));
		scanner.close();

		
	}

}
