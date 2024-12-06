package newfeatures;

/**
* Auhtor : Satyam.3.Singh
* Date   : 9 Nov 2024
* Time   : 11:40:41 am
* Email  : satyam.3.singh@coforge.com
*/

public class Car implements Vehicle{
	
	private String brand;
	

	public Car(String brand) {
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String speedUp() {
		return "Car is speeding up!!";
	}

	@Override
	public String speedDown() {
		return "Car is slowing down!!";
	}

}
