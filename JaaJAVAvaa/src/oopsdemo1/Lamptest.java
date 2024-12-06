package oopsdemo1;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 26 Oct 2024
 * Time   : 11:48:15 am
 * Email  : satyam.3.singh@coforge.com
 */
class Lamp{
	//Stores status of Lamp
	private boolean isOn;

	//Default Constructor - 
	//Compiler Creates it for Automatic initialization of Object Properties

	//Method to turn On the Lamp
	public void turnOn() {
		isOn=true;
		System.out.println("Light On ? : "+isOn);
	}
	//Method to turn Off the Lamp
	public void turnOff() {
		isOn=false;
		System.out.println("Light On ? : "+isOn);
	}

}
//Java OOP to create Instance & Main class in Single File
//main class - File should be saved as LampTest - The Main class name
public class Lamptest {
	public static void main(String[] args) {
			Lamp led=new Lamp();
			Lamp Halogen=new Lamp();
			
			led.turnOn();
			Halogen.turnOn();
			
			led.turnOff();
			Halogen.turnOff();
	}
}
