package controlflow;

/**
* Auhtor : Satyam.3.Singh
* Date   : 24 Oct 2024
* Time   : 4:19:17 pm
* Email  : satyam.3.singh@coforge.com
*/

public class DoWhileDemo {
	public static void main(String[] args) {
		int i=1;
		
		//Do-Whilw loop executes at-lesat once, even if the condition is False

		do {
			System.out.println(i);
			i=i+1;
		}
		while (i>5);
		System.out.println("loop Terminated");
	}
}
