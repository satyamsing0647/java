package controlflow;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 24 Oct 2024
* Time   : 12:38:58 pm
* Email  : satyam.3.singh@coforge.com
*/

public class SwitchDemo2 {
	public static void main(String[] args) {
		float num1,num2,result;
		String operator;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter 2 Numbers :");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		System.out.println("Enter Arithmetic Operator (+,-,*,/) :");
		operator=scanner.next();
		scanner.close();
		
		switch (operator) {
		case "+": result =num1+num2;
		System.out.println("The additon of "+num1+" and "+num2+" is: "+result);
		break;
		
		case "-": result =num1-num2;
		System.out.println("The substraction of "+num1+" and "+num2+" is: "+result);
		break;

		case "*": result =num1*num2;
		System.out.println("The multiplication of "+num1+" and "+num2+" is: "+result);
		break;
		
		case "/": result =num1/num2;
		System.out.println("The division of "+num1+" and "+num2+" is: "+result);
		break;
		
		default: System.out.println("invalid operator");
		break;
	}
}
}
