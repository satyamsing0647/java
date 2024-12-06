package controlflow;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 24 Oct 2024
* Time   : 3:15:54 pm
* Email  : satyam.3.singh@coforge.com
* Program to display multiplication
*/

public class Multiplication {
	public static void main(String[] args) {
		int i=1,mul,num;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a number : ");
		num=scan.nextInt();
		scan.close();
		
		System.out.println("****** Multiplication of table "+num);
		while (i <=10 ) {
			mul=num*i;
		System.out.println(num + " * "+i+" = "+mul);
		i+=1;
		}
	}
}
