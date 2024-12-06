package arraysDemo;

/**
* Auhtor : Satyam.3.Singh
* Date   : 25 Oct 2024
* Time   : 11:52:40 am
* Email  : satyam.3.singh@coforge.com
*/

public class ArrayInputOutput {
	public static void main(String[] args) {
		int[] marks=new int[10];
		
		String[] name= {"Jack","Mike","Mary","James","Ron"};
		
		float[] scores;
		scores =new float[5];
		
		scores[0]=34.45f;
		scores[1]=80.50f;
		scores[2]=55.00f;
		
		for(int i=0; i < marks.length; i++) {
			marks[i]=i*50;
		}
		
		System.out.println("******** Integer Array Contents ********");
		for (int i=0; i < marks.length; i++) {
			System.out.print(marks[i]+"\t");
		}
		System.out.println();
		System.out.println("*********String Array Contents ************");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
		System.out.println();
		
		System.out.println("*********Float Array Contents ************");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+"\t");
		}
		System.out.println();
		
		//Iterate in nonLinear
		System.out.println("*********Integer Array Contents in Even Index ************");
		for (int i = 0; i < marks.length; i=i+2) {
			System.out.print(marks[i]+"\t");
		}
		System.out.println();
	}
}
