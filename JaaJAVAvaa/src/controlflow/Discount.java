/*
 * Java program to check if the user is eligible for a discount or not.
 * If the user's age is less than 18 or they are not a member, they are eligible for a discount.
 * Otherwise, they are not eligible for a discount.
 */

package controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Discount {
	public static void main(String[] args) throws IOException {
		InputStreamReader is =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String name;
		int Age;
		boolean isMember;
		
		//Ask user for Membership Status
		
		System.out.println("Enter your Name : ");
		name=br.readLine();
		System.out.println("Enter your Age : ");
		Age=Integer.parseInt(br.readLine());
		System.out.println("Are you a Member? : ");
		isMember=Boolean.parseBoolean(br.readLine());
		
		if (Age < 18 || !isMember) {
			System.out.println(name+" is Eligible for dsicount");
		}
		else {
			System.out.println(name+" is not Eligible for the disconunt");
		}
	}

}
