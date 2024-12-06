package exceptiondemo;

import java.util.Scanner;

import basic.Arithematic;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 6 Nov 2024
 * Time   : 12:51:46 pm
 * Email  : satyam.3.singh@coforge.com
 */

public class DivisionWithException {

	public static void main(String[] args) {

		//Division of 2 Numbers without Exception Handling

		int a, b, result;
		Scanner input = new Scanner(System.in);

		System.out.println("Input two integers :");
		a = input.nextInt();
		b = input.nextInt();

		//statements to be monitored which may throw exception

		try {
			result = a / b; //Exception is thrown by JRE for Divide by Zero Exception
			System.out.println("Result = " + result);
		}

		//Exception thrown in try block is handled in catch block
		//using Exception Object

		catch(ArithmeticException ex) {

			System.out.println("Please ENter Second Number as Non-Zero");
			System.err.println("Exception Name and Description:"+ex.toString());
			System.err.println("Exception Description : "+ex.getMessage());

			ex.printStackTrace();
		}
		finally {
			input.close();
			System.out.println("In Finally Block");
		}
	}
}
