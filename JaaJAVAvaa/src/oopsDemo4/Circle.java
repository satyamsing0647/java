package oopsDemo4;

/**
* Auhtor : Satyam.3.Singh
* Date   : 30 Oct 2024
* Time   : 10:46:55 am
* Email  : satyam.3.singh@coforge.com
*/

public class Circle extends Shape{
	private final double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	@Override
	public Double calculateArea() {
		// TODO Auto-generated method stub
		return radius*radius*Math.PI;
	}

}
