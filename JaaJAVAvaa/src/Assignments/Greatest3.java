package Assignments;

import java.util.Scanner;

public class Greatest3 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter three numebers : "); // sysout ---> ctrl+space (shortcut)
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();

		if (a > b && a > c) {
			System.out.println( " The Greatest Number is : "+a );
		}
		else if (b > a && b > c) {
			System.out.println( " The Greatest Number is : "+b );
		}
		else if (c>  a && c > b) {
			System.out.println( " The Greatest Number is : "+c );
		}
		else if (a==b && a==c) {
			System.out.println("all are equal");
		}
		scanner.close();
	}

}
