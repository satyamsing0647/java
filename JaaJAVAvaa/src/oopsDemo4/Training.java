package oopsDemo4;

/**
* Auhtor : Satyam.3.Singh
* Date   : 30 Oct 2024
* Time   : 11:32:38 am
* Email  : satyam.3.singh@coforge.com
*/

public abstract class Training {
	private String name;
	private String address;
	private int number;
	public Training(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Training [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
	
	public abstract double calculateMarks();
}
