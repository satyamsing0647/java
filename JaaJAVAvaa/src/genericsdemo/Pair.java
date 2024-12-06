package genericsdemo;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 5 Nov 2024
 * Time   : 11:34:02 am
 * Email  : satyam.3.singh@coforge.com
 * 
 *     // Generic class with 2 parameters - 
//Maps- Stores data in form of key & value pairs - Hashmap, TreeMap
 */

public class Pair<T,U> {
	
	private T first;
	private U second;
	
	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public U getSecond() {
		return second;
	}

	public void setSecond(U second) {
		this.second = second;
	}
	
	
}
