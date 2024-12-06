package oopsdemo1;

/**
* Auhtor : Satyam.3.Singh
* Date   : 26 Oct 2024
* Time   : 3:36:23 pm
* Email  : satyam.3.singh@coforge.com
*/

public class Timetest {
	public static void main(String[] args) {
		
		Time t1=new Time(12, 45, 55);
		Time t2=new Time(10, 30, 30);
		
		t1.add(t2);
		t1.display();
		
	}
}
