package newfeatures;

/**
* Auhtor : Satyam.3.Singh
* Date   : 9 Nov 2024
* Time   : 2:57:38 pm
* Email  : satyam.3.singh@coforge.com
*/

public class MusicalInstrument {
	
	private String name;
	private String type;
	private double price;
	
	public MusicalInstrument(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "MusicalInstrument [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	
	
}
