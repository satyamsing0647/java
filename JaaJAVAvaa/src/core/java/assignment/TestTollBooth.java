package core.java.assignment;

/**
* Auhtor : Satyam.3.Singh
* Date   : 11 Nov 2024
* Time   : 11:57:56 pm
* Email  : satyam.3.singh@coforge.com
*/

public class TestTollBooth {
	
	public static void main(String[] args) {
		
		ToolBooth booth=new AlleghenyTollBooth();
		
		Truck ford=new Ford(5, 12500);
		Truck nissan=new Nissan(2, 5000);
		Truck daewoo=new Daewoo(6, 17000);
		
		booth.calcTool(ford);
		booth.calcTool(nissan);
		booth.calcTool(daewoo);
		booth.collectReciepts();
		booth.displayData();
	}
}
