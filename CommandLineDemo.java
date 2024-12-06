/* program to find the average and sum of 3 numbers using command line
Arguments for input values ar run-time */
public class CommandLineDemo{
	public static void main(String[] args){
		String name;                            // variable declarations
		int num1,num2,num3,sum=0;
		float avg;

//take input from user command prompt

		name=args[0];
		num1=Integer.parseInt(args[1]);
		num2=Integer.parseInt(args[2]);
		num3=Integer.parseInt(args[3]);

//perform calculations

		sum=num1+num2+num3;
		avg= (float) sum/3;                   // TypeCasting

		System.out.println("The sum of 3 numbers is " + sum);
		System.out.println("The average of 3 numbers is " + avg);
		System.out.println("Thank you mr. "+name+" . Happy Coding !!!");
}
}