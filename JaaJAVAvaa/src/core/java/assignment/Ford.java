package core.java.assignment;

/**
* Auhtor : Satyam.3.Singh
* Date   : 11 Nov 2024
* Time   : 11:37:32 pm
* Email  : satyam.3.singh@coforge.com
*/

public class Ford implements Truck{
	
	private int axels;
	private int weight;
	
	public Ford(int axels, int weight) {
		this.axels = axels;
		this.weight = weight;
	}

	@Override
	public int getaxels() {
		// TODO Auto-generated method stub
		return axels;
	}

	@Override
	public int getweight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public String getbrand() {
		// TODO Auto-generated method stub
		return "Ford";
	}
	
	
}

