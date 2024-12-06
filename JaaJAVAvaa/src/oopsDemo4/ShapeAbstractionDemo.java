package oopsDemo4;

/**
* Auhtor : Satyam.3.Singh
* Date   : 30 Oct 2024
* Time   : 10:53:31 am
* Email  : satyam.3.singh@coforge.com
*/

public class ShapeAbstractionDemo {
	public static void main(String[] args) {
		/* Shape s1= new Shape(); */
		Shape s;
		s=new Circle(5);
		System.out.println("The area of circle is : "+s.calculateArea());
		
		s=new Square(4.0);
		System.out.println("The area of square is : "+s.calculateArea());
	}
}
