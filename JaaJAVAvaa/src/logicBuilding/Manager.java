package logicBuilding;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 30 Oct 2024
 * Time   : 12:19:12 am
 * Email  : satyam.3.singh@coforge.com
 */

public class Manager extends Employee{

	private Developer[] developers;
	private int developercount=0;

	public Manager(String name, double salary, int maxDevelopers) {
		super(name, salary);
		developers=new Developer[maxDevelopers];
	}

	public void addDeveloper(Developer developer) {
		if (developercount < developers.length) {
			developers[developercount++]=developer;
		}
		else {
			System.out.println("Cannot add more developers. Max limit reached.");
		}
	}

	// Overridden method to include managed developers in the details
	@Override
	public String getDetails() {
		StringBuilder details = new StringBuilder(super.getDetails() + ", Managing Developers:");
		for (int i = 0; i < developercount; i++) {
			details.append("\n  ").append(developers[i].getDetails());
		}
		return details.toString();

	}
}
