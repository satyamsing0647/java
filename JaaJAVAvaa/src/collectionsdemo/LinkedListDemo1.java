package collectionsdemo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 5 Nov 2024
 * Time   : 4:07:06 pm
 * Email  : satyam.3.singh@coforge.com
 */

public class LinkedListDemo1 {

	public static void main(String[] args) {

		LinkedList<Double> stockprices=new LinkedList<>();

		//LinkedList containing stock prices of a Company for last 6 days
		stockprices.add(45.00);
		stockprices.add(52.00);
		stockprices.add(62.50);
		stockprices.add(42.70);
		stockprices.add(37.20);
		stockprices.add(69.40);

		System.out.println("Initial Stock Prices : "+stockprices);

		//Manipulations
		stockprices.addFirst(77.00);
		stockprices.addLast(90.10);
		stockprices.add(3,55.55);
		stockprices.set(1,33.33); //Update

		System.out.println("Stock Prices After Manipulation :");
		Iterator<Double> itr=stockprices.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}
}
