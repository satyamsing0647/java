package controlflow;

import java.util.Scanner;

public class Greatest2 {

	public static void main(String[] args) {
		
		int a,b;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter 2 Numbers");
		a=scan.nextInt();
		b=scan.nextInt();
		
		//implementation
		
		if (a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		scan.close();
	}

}
