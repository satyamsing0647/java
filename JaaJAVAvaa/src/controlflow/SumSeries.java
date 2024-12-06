package controlflow;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 24 Oct 2024
* Time   : 3:11:28 pm
* Email  : satyam.3.singh@coforge.com
*/

public class SumSeries {
	public static void main(String[] args) {
		int num,i=1,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a limit : ");
		num=scan.nextInt();
		scan.close();
		while (i <= num) {
			sum=sum+i;
			i +=1;
		}
		System.out.println("The sum of series is: " + sum);
	}
}
