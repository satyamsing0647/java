package controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Auhtor : Satyam.3.Singh
* Date   : 24 Oct 2024
* Time   : 11:58:00 am
* Email  : satyam.3.singh@coforge.com
*/

public class TernaryDemo2 {
	public static void main(String[] args) throws IOException {
		char myChar;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		   	
		        System.out.println("Enter a Character :");
		        myChar=br.readLine().charAt(0); //Character I/p

		        //Ternary Operator to check Simple Conditions
		
		        String msg =(myChar >= 'a' && myChar <='z' || myChar >= 'A' && myChar <='Z' ) ?
		        myChar+" is an Alphabet": myChar+" not an Alphabet";

		        System.out.println(msg);

	}
}
