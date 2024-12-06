package arraysDemo;

/**
* Auhtor : Satyam.3.Singh
* Date   : 25 Oct 2024
* Time   : 12:10:26 pm
* Email  : satyam.3.singh@coforge.com
* //Define array reference "marks" & Create array of int to hold 10 values
*/

public class ForEachDemo {
	public static void main(String[] args) {
		int[] marks= {78,45,80,22,60,66,90,35,55,59};
		
		String[] name= {"Jack","Mike","Mary","James","Ron"}; //Declare fixed Array
		
		float[] scores;
		scores=new float[5]; //Array to store scores 
		
		//Initialize Array Elements -Input
		scores[0]=34.45f;
		scores[1]=80.50f;
		scores[2]=55.00f;
		scores[3]=89.00f;
		scores[4]=70.50f;
		
		System.out.println("Integer array displayed using for-each loop :");
		for(int i:marks) {
			System.out.print(i+"\t");
		}
		System.out.println("\n");
		
		System.out.println("String array displayed using for-each loop :");
		for(String i:name) {
			System.out.print(i+"\t");
		}
		System.out.println('\n');
		
		System.out.println("Float array displayed using for-each loop :");
		for(Float i:scores) {
			System.out.print(i+"\t");
		}
		System.out.println("\n");
	}
}
