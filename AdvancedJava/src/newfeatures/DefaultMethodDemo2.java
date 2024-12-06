package newfeatures;

/**
* Auhtor : Satyam.3.Singh
* Date   : 9 Nov 2024
* Time   : 11:42:43 am
* Email  : satyam.3.singh@coforge.com
*/

public class DefaultMethodDemo2 {
	
	public static void main(String[] args) {
		
		Vehicle car = new Car("BMW");
		
		//invoke overriden methods
		
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.speedDown());
		
		//invoke deault methods
		
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());

		//invoke static method of interface
		
		System.out.println(Vehicle.getHorsePower(2500, 400));
	}
}
