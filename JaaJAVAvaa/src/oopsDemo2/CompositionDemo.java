package oopsDemo2;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 29 Oct 2024
 * Time   : 11:22:20 am
 * Email  : satyam.3.singh@coforge.com
 */
class Hyundai extends Car{
	public void hyndaiStart() {
		Engine heng=new Engine();
		heng.startEngine();
	}
}
class Maruti extends Car{
	public void marutiStart() {
		Engine meng=new Engine();
		meng.startEngine();
	}
}
public class CompositionDemo {
	@SuppressWarnings("null")
	public static void main(String[] args) {

		Maruti baleno =new Maruti();

		baleno.setColor("Silver"); //car class methods
		baleno.setMax_speed(180);	//car class methods

		System.out.println("*******Maruti Car Details *********");
		System.out.println(baleno.getColor() +" Color");//car class methods
		System.out.println(baleno.getMax_speed()+" Speed");//car class methods

		baleno.marutiStart(); // Maruti class method-- > call ENgine class method

		baleno=null; //baleno object destroyed . along with the engine object
		System.gc();
		baleno.marutiStart();
		System.out.println(baleno.getColor());
		
		Hyundai creta=new Hyundai();
		creta.setColor("pink");
	}
}