package oopsDemo4;

/**
* Auhtor : Satyam.3.Singh
* Date   : 30 Oct 2024
* Time   : 10:52:10 am
* Email  : satyam.3.singh@coforge.com
*/

public class Square extends Shape{
	private final Double side;
	
	public Square(Double side) {
		this.side=side;
	}
	@Override
	public Double calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
