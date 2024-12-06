package oopsdemo1;

/**
* Auhtor : Satyam.3.Singh
* Date   : 26 Oct 2024
* Time   : 4:48:46 pm
* Email  : satyam.3.singh@coforge.com
*/

//object class is a parent class of all java classes
class Test{
	//Implement finalize() method of object class - Destructor method - Destroys object
	@SuppressWarnings("removal")
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Object Destroyed & garbage collected");
		
		super.finalize();
	}
	
	
}
public class DestructorDemo {
	public static void main(String[] args) {
		
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		Test t4=new Test();

		t1=null;
		t2=null;
		t3=null;
		
		System.gc(); //invoke service method gc(), which in-turn invokes finalize method
		
	}
}
