package genericsdemo;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 5 Nov 2024
 * Time   : 11:23:59 am
 * Email  : satyam.3.singh@coforge.com
 */
class Sample<T>{  //generic class / parameterized ckass T-type

	private T data;

	public Sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}


}
public class GenericClassDemo {
	
	public static void main(String[] args) {
		
		Sample<String> s1=new Sample<String>("Java Generics"); //object of generic class for type string
		
		System.out.println("Display from generic class by passing string object :"+s1.getData());
		
		Sample<Integer> s2=new Sample<Integer>(200);
		
		System.out.println("Display from generic class by passing Integer object :"+s2.getData());
		
		Sample<Double> s3=new Sample<Double>(555.50);
		
		System.out.println("Display from generic class by passing Double object :"+s3.getData());

	}
}
