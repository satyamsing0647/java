package core.java.assignment;

/**
* Auhtor : Satyam.3.Singh
* Date   : 11 Nov 2024
* Time   : 11:39:26 pm
* Email  : satyam.3.singh@coforge.com
*/

public class Daewoo implements Truck{
	
	private int axels;
	private int weight;
	
	public Daewoo(int axels, int weight) {
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
		return "Daewoo";
	}
	
	
}
