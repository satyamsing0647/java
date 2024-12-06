package Assignments;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 25 Oct 2024
* Time   : 9:58:00 pm
* Email  : satyam.3.singh@coforge.com
*/

public class GradeProgram {
	public static void main(String[] args) {
		String result;
		int score;
		Scanner scan = new Scanner(System.in);

		//Input
		System.out.println("Enter the score");
		score=scan.nextInt();
		scan.close();

		
		// logic for displaying unit
				
		if (score >= 90) {
			result="A";
		}
		else if (score >= 80 && score <= 89) {
			result="B";
		}
		else if (score >= 70 && score <= 79) {
			result="C";
		}
		else if (score >= 60 && score <= 69) {
			result="D";
		}
		else   {
			result="F";
		}
		

		//Display

		System.out.println("Result    : "+result);
		
		}

	}
