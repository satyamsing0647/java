package controlflow;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 25 Oct 2024
* Time   : 9:19:33 am
* Email  : satyam.3.singh@coforge.com
*/

public class VowelsCheck {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String sentence;
		
		System.out.println("Enter a Sentence :");
		sentence=scan.nextLine();
		
		String sentence1=sentence.toLowerCase();
		int count=0;
		scan.close();
		
		for (int i=0;i <sentence.length();i++) {
			if(sentence1.charAt(i)== 'a' || sentence1.charAt(i)== 'e' || sentence1.charAt(i)== 'i' || 
			sentence1.charAt(i)== 'o' || sentence1.charAt(i)== 'u') {
				
			count =count +1;	
			}
		}System.out.println("the total no. of vowels in \""+sentence+"\" is :"+count );
		
	}
}
