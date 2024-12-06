package oopsdemo1;

/**
* Auhtor : Satyam.3.Singh
* Date   : 26 Oct 2024
* Time   : 4:12:04 pm
* Email  : satyam.3.singh@coforge.com
* 
* 
* program to demonstrate constructir overloading - constructor with different parameters
*/

public class Languages {
	private String name;
	private float version;
	
	//default constructor
	public Languages() {
		this.name="Java";
		this.version=8.0f;
		System.out.println("The Language is : "+this.name +"-V"+this.version);
	}

	// Constructor with One string
	public Languages(String name) {
		this.name = name;
		this.version=5.0f;
		System.out.println("The Language is : "+this.name +"-V"+this.version);
	}

	//constructor with one float
	public Languages(float version) {
		this.name="Python";
		this.version = version;
		System.out.println("The Language is : "+this.name +"-V"+this.version);
	}

	//Constructor with 2 parameters
	public Languages(String name, float version) {
		this.name = name;
		this.version = version;
		System.out.println("The Language is : "+this.name +"-V"+this.version);
	}
	
	
	
	
	
}
