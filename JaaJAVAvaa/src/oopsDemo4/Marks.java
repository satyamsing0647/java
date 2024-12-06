package oopsDemo4;

/**
* Auhtor : Satyam.3.Singh
* Date   : 30 Oct 2024
* Time   : 11:35:50 am
* Email  : satyam.3.singh@coforge.com
*/

public class Marks extends Training{

	private double marks;

	public Marks(String name, String address, int number, double marks) {
		super(name, address, number);
		this.marks = marks;
	}

	@Override
	public double calculateMarks() {
		System.out.println("Marks :"+marks);
		return (marks*2);
	}

}
