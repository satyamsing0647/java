package collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 5 Nov 2024
 * Time   : 4:37:12 pm
 * Email  : satyam.3.singh@coforge.com
 */

public class ListIteratorDemo2 {

	public static void main(String[] args) {

		List<String> carList = new LinkedList<String>();
		carList.add("Audi");
		carList.add("Jaguar");
		carList.add("BMW");
		carList.add("Mini Cooper");

		System.out.println(carList);
		//Getting ListIterator
		ListIterator<String> ltr = carList.listIterator(); 

		while(ltr.hasNext()){
			String car = ltr.next();

			if(car.equals("BMW")) {
				ltr.add("Mercedes");
			}
			if(car.equals("Mini Cooper")) {
				ltr.set("Camry");
			}
		}
		System.out.println("List elements- " + carList);

		// Create new ArrayList from LinkedLIst
		List<String> a=new ArrayList<String>(carList);
		System.out.println(a);
	}
}
