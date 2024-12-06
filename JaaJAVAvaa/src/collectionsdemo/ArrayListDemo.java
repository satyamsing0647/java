package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
* Auhtor : Satyam.3.Singh
* Date   : 5 Nov 2024
* Time   : 12:40:06 pm
* Email  : satyam.3.singh@coforge.com
*/

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("Java");
		a1.add("Perl");
		a1.add("C++");
		a1.add("C# 5.0");
		a1.add("Java");
		a1.add("Python");
		
		System.out.println();
		
		System.out.println("Element at Index 1:"+a1.get(1));
		
		System.out.println("Does List contains element Java ?:"+a1.contains("java"));
		a1.add(2,"Oracle");
		System.out.println(a1);
		
		System.out.println("Is ArrayList Empty ? "+a1.isEmpty());
		System.out.println("Index of Perl :"+a1.indexOf("Perl"));
		System.out.println("Size of ArrayList :"+a1.size());
		
		Collections.sort(a1);
		System.out.println(Collections.max(a1));
		System.out.println("Array List after sorting :"+a1);
		
		ArrayList<Integer> a2=new ArrayList<Integer>(); //default size of arraylist is 10
		
		a2.add(100);
		a2.add(500);
		a2.add(73);
		a2.add(66);
		a2.add(350);
		a2.add(73);


		System.out.println(a2);
		System.out.println("Size :"+a2.size());
	}
}
