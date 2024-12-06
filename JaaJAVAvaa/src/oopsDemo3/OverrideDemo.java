package oopsDemo3;

/**
* Auhtor : Satyam.3.Singh
* Date   : 29 Oct 2024
* Time   : 2:43:09 pm
* Email  : satyam.3.singh@coforge.com
*/

public class OverrideDemo {
	public static void main(String[] args) {
		
		SBI sbibank=new SBI("SBI");
		Axis axisbank=new Axis("Axis");
		ICICI icicibank=new ICICI("ICICI");
		
		sbibank.display();
		System.out.println("\tThe Intrest rate is : "+sbibank.getRateofInterest()+"%");
		
		axisbank.display();
		System.out.println("\tThe Intrest rate is : "+axisbank.getRateofInterest()+"%");
		
		icicibank.display();
		System.out.println("\tThe Intrest rate is : "+icicibank.getRateofInterest()+"%");
	}
}
