package controlflow;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Auhtor : Satyam.3.Singh
* Date   : 24 Oct 2024
* Time   : 11:46:18 am
* Email  : satyam.3.singh@coforge.com
*/

public class TernaryDemo1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int a,b,result;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers ");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		
		String result1 = a > b ? "a is greatest" : "b is greatest" ;
		System.out.println(result1);
		
		result = a > b ? a:b;
		System.out.println("the greatest is "+ result);
	}
}
