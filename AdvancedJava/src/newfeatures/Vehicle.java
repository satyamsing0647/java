package newfeatures;

/**
* Auhtor : Satyam.3.Singh
* Date   : 9 Nov 2024
* Time   : 11:37:56 am
* Email  : satyam.3.singh@coforge.com
*/

public interface Vehicle {
	
	String getBrand();
	String speedUp();
	String speedDown();
	
	// Any non-abstract methods must be made default to add any new feature
	default String turnAlarmOn()
	{
		return "Turning the Vehicle Alarm ON.";
	}
	
	default String turnAlarmOff()
	{
		return "Turning the Vehicle Alarm OFF.";
	}
	
	static int getHorsePower(int rpm,int torque)
	{
		return (rpm*torque)/5252;
	}
}
