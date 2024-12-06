package controlflow;

/**
* Auhtor : Satyam.3.Singh
* Date   : 25 Oct 2024
* Time   : 9:48:25 am
* Email  : satyam.3.singh@coforge.com
*/

public class JumpDemo {
	public static void main(String[] args) {
		
		int i;
		
		System.out.println("********* Break Statement Demo *******");
		for (i=1;i<=10;i++) {
			if(i==5) break; // Terminate the Loop
			System.out.println(i);
		}
		System.out.println("********* Continue Statement Demo *******");
		for (i=1;i<=10;i++) {
			if(i>4 && i<9) continue;//Skips current Iteration & COntinues with Next
			System.out.println(i);
	}
}
}
