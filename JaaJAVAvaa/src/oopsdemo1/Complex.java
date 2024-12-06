package oopsdemo1;

/**
* Auhtor : Satyam.3.Singh
* Date   : 26 Oct 2024
* Time   : 3:00:28 pm
* Email  : satyam.3.singh@coforge.com
* 
* Program to Add 2 Complex Numbers - Real & Imaginary Part
* Demonstrate constructors & this keyword
*/

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void add(Complex obj) {
		this.real+=obj.real; // 'this' keyword access Complex1 Object , Complex1.real + Complex2.real, its like a=a+b and the value is stored in the a..
		this.imaginary+=obj.imaginary;//
	}
	
	public void display() {
		System.out.println("The Addition of 2 Complex Numbers is :");
		System.out.println("r"+this.real+" i"+this.imaginary);
	}
	
}
