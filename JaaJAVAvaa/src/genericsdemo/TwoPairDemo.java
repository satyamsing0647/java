package genericsdemo;

import java.util.Scanner;

/**
* Auhtor : Satyam.3.Singh
* Date   : 5 Nov 2024
* Time   : 11:37:12 am
* Email  : satyam.3.singh@coforge.com
*/

public class TwoPairDemo {
	
	public static void main(String[] args) {
		
	
	Pair<String,Integer> p1=new Pair<String,Integer>("The Car Guys",8);
	
	Scanner s= new Scanner(System.in);
	
	System.out.println("Our Current rating for "+p1.getFirst()+" is: "+p1.getSecond());
	
	System.out.println("How would you rate them ?:");
	int score =s.nextInt();
	
	p1.setSecond(score);
	
	System.out.println("Our new rating for "+p1.getFirst()+ " is : "+p1.getSecond());
	
	Pair<String, Float> p2=new Pair<String, Float>("TROY", 8.5f);
	
	System.out.println("Our Current Rating for "+p2.getFirst() + " is : "+p2.getSecond());
	
	System.out.println("How would you rate them ?:");
	float score1 =s.nextFloat();
	
	p2.setSecond(score1);
	
	System.out.println("Our New Rating for "+p2.getFirst() + " is : "+p2.getSecond());
	
	s.close();
	
	}
}

