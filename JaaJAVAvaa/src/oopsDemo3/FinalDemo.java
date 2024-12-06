package oopsDemo3;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 30 Oct 2024
 * Time   : 9:40:26 am
 * Email  : satyam.3.singh@coforge.com
 */

class myDemo{

	private static int MAX_AGE=65;
	private int age=21;
	public void test() {
		MAX_AGE=60;
	}

	/*
	 * public final void test1() { System.out.println("The Age is : "+age); }
	 */


	class MyTemp extends myDemo{
		public void test1() {
			System.out.println("The Age is : "+age);
		}
	}
class Hello{
	int a,b;
	
	public Hello(int a,int b) {
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return "Hello [a=" + a + ", b=" + b + "]";
	}
	
}
class World extends Hello{

	public World(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
}
}
public class FinalDemo {

	}
