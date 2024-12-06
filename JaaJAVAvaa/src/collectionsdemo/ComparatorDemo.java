package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 6 Nov 2024
 * Time   : 12:33:29 pm
 * Email  : satyam.3.singh@coforge.com
 */

public class ComparatorDemo {

	public static void main(String[] args) {

		// comparator interface is used to sort objects user defined class 
		// based on multiple fields


		ArrayList<Developer>  a1= new ArrayList<Developer>();

		Developer d1=new Developer(103,"Mike","Java");
		Developer d2=new Developer(105,"Mary","Dot Net");
		Developer d3=new Developer(101,"Ravi","Angular");
		Developer d4=new Developer(102,"Hary","Php");
		Developer d5=new Developer(104,"Navin","Oracle");

		//adding developers to ArrayList
		a1.add(d1);a1.add(d2);a1.add(d3);a1.add(d4);a1.add(d5);

		System.out.println("-------- UnSorted-----------");
		for(Developer i:a1)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
		}
		
		Collections.sort(a1, new IdComparator());
		
		System.out.println("-------- Sort By Id ---------");
		for(Developer i:a1)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
		}
		
		Collections.sort(a1, new DomainComparator());
		
		System.out.println("------------ Sort By Domain ------------");
		for(Developer i:a1)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
		}
	}
}
