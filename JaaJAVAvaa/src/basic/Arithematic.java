package basic;
import java.util.Scanner;
/* java program to perform arithmetic operations using scanner input methods
 */

public class Arithematic {

	public static void main(String[] args) {
		
		// declaration of variables
		
		int a,b,sum,sub,mul;
		float div;
		String name;
		Scanner scanner=new Scanner(System.in);
		
		// input statement - take input using scanner object
		
		System.out.println("your name : ");
		name=scanner.nextLine();
		System.out.println("enter two numebers : "); // sysout ---> ctrl+space (shortcut)
		a=scanner.nextInt();
		b=scanner.nextInt();
		
		
		//process
		
		sum=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		
		//output 
		
		System.out.println("hello " + name);
		System.out.println("the addition of a,b is : " + sum);
		System.out.println("the substraction of a,b is : " + sub);
		System.out.println("the multiplication of a,b is : " + mul);
		System.out.println("the division of a,b is : " + div);

		
		scanner.close();

	}

}
