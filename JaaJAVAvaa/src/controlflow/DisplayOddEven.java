package controlflow;



/**
* Auhtor : Satyam.3.Singh
* Date   : 24 Oct 2024
* Time   : 3:24:13 pm
* Email  : satyam.3.singh@coforge.com
* Program to display odd and even numbers following format
* 
*  ODD   EVEN
*  ----  ----
*  1      2
*  3      4
*  5      6
*  7      8
*  9      10
*/

public class DisplayOddEven {
	public static void main(String[] args) {
		int i=1;
		
		System.out.println("ODD\tEVEN ");
		System.out.println("----\t----");
		
		while (i<=10) {
			if (i%2==1) {
				System.out.print(i+"\t");
			}
			else {
				System.out.println(i);
			}
			i+=1;
		}
	}
}
