/* 
 * Java Program to find Volume of the cylinder
 */
package basic;

import java.util.Scanner;

public class VolumeCylinder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float v,r,h;   // variables declaration
		final float PI=3.14f; // constant declaration

		System.out.println("Enter Radius of a Cylinder :");
		r=s.nextFloat();  // float input
		System.out.println("Enter height of a Cylinder :");
		h=s.nextFloat();  // float input

		v=PI*r*r*h;  // calculate area of circle

		System.out.println("The volume of cylinder : "+v);
		System.out.format("%.2f", v);

		s.close();


	}
}