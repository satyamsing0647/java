package collectionsdemo;

import java.util.Iterator;
import java.util.Stack;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 5 Nov 2024
 * Time   : 3:30:27 pm
 * Email  : satyam.3.singh@coforge.com
 */

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> s=new Stack<String>();

		s.push("Mike");
		s.push("John");
		s.push("Andrews");
		s.push("Rod");
		s.push("Mary");

		System.out.println("Remove Elemnt :"+s.pop());

		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("Element on Top :"+s.peek());
		System.out.println("Search John :"+s.search("John"));
	}
}
