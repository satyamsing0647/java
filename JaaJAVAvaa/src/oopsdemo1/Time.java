package oopsdemo1;

/**
* Auhtor : Satyam.3.Singh
* Date   : 26 Oct 2024
* Time   : 3:18:21 pm
* Email  : satyam.3.singh@coforge.com
* 
* Java program to perform addition of 2 Times
 *  t1 --> 12 : 45 :55
 *  t2 --> 10 : 30 :30
 *         23   16 :25
 *  
 *     t1 + t2
 *     if sec> 60 .. mins should be incremented by 1 & sec -60 ,
 *     if min> 60  ... hrs should be incremented by 1 & min -60
*/

public class Time {
	private int hrs,min,sec;

	public Time(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}
	
	public void add(Time gg) {
		this.sec+=gg.sec;
		this.min+=gg.min;
		this.hrs+=gg.hrs;
	
		
		if (this.sec >=60) {
			this.min+=1;
			this.sec=this.sec-60;
	
		}
		if (this.min >=60) {
			this.hrs+=1;
			this.min-=60;
		}
	
}
	public void display() {
		System.out.println("The Addition of 2 Time is :");
		System.out.println(this.hrs + " " + this.min +" "+ this.sec);
	}
}

