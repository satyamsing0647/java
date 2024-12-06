package controlflow;

import java.util.Scanner;

/*
 * Program to check whether the entered number is single digit or not
 */
public class SingleDigit {

	public static void main(String[] args) {
		
		int num;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		num=scan.nextInt();
		
		//implementation
		
		if (num>-10 && num<10) {
			System.out.println(num+ " Is single Digit");
		}
		else {
			System.out.println(num+" Is a double digit");
		}
		scan.close();
	}

}
