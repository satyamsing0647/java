package controlflow;

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
			System.out.println( a +" is the Greatest Number");
		}
		else if (b > a && b > c) {
			System.out.println( b +" is the Greatest Number");
		}
		else if (c>  a && c > b) {
			System.out.println(c+" is the Greatest Number");
		}
		else if (a==b && a==c) {
			System.out.println("all are equal");
		}
		scanner.close();
	}

}
