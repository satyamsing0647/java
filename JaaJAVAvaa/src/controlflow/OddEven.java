package controlflow;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		int num;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		num=scan.nextInt();
		
		//condition
		
		if (num%2==0){
				System.out.println("The number "+ num +" is even");
		}
		else {
			System.out.println("The number "+num+" is odd");
		}
		scan.close();
	}

}
