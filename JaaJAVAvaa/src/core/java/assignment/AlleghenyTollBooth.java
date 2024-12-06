package core.java.assignment;

/**
* Auhtor : Satyam.3.Singh
* Date   : 11 Nov 2024
* Time   : 11:41:55 pm
* Email  : satyam.3.singh@coforge.com
*/

public class AlleghenyTollBooth implements ToolBooth{
	
	private int TotalTrucks;
	private int TotalRecipets;
	@Override
	public void calcTool(Truck a) {
		
		int toll =10*(a.getweight()/500)+5*a.getaxels();
		TotalRecipets= TotalRecipets + toll;
		TotalTrucks=TotalTrucks+1;
		System.out.println("Arrival of " + a.getbrand() + " Truck");
		System.out.println("Truck arrival - Axles: " + a.getaxels() +
				" Total weight: " + a.getweight() + " Toll due: $" + toll);
		
	}
	@Override
	public void displayData() {
		
		System.out.println("Totals since last collection - Receipts: $" + TotalRecipets + " Trucks: " + TotalTrucks);
	}
	@Override
	public void collectReciepts() {
		// TODO Auto-generated method stub
		System.out.println("*** Collecting receipts ***");
		displayData();
		TotalRecipets = 0;
		TotalTrucks = 0;
		System.out.println("***** Reset Receipts *****");
		displayData();
	}
	
}
