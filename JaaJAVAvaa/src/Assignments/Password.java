package Assignments;

import java.util.Scanner;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 27 Oct 2024
 * Time   : 11:05:43 am
 * Email  : satyam.3.singh@coforge.com
 */

public class Password {
	public static void main(String[] args) {
		String password;

		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter your password : ");
		password=scan.next();
		
		if (isStrong(password)) {
			System.out.println("Password is strong");
		}
		else if (isMedium(password)){
			System.out.println("password is Medium");
		}
		else {
			System.out.println("password is weak");
		}
		scan.close();
	}
	public static boolean isStrong(String password) {
		return password.length() >= 8 && 
			password.matches(".*[A-z]*.") &&
			password.matches(".*[a-z]*.") &&
			password.matches(".*[0-9]*.") &&
			password.matches(".*[!@#$%^&*()_+].*");
 	}
	public static boolean isMedium(String password) {
		return password.length() >= 8 && 
			password.matches(".*[A-z]*.") &&
			password.matches(".*[a-z]*.") &&
			password.matches(".*[0-9]*.");
 	}
}

