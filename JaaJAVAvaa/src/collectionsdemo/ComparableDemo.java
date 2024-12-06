package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
* Auhtor : Satyam.3.Singh
* Date   : 6 Nov 2024
* Time   : 12:06:07 pm
* Email  : satyam.3.singh@coforge.com
*/

public class ComparableDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(new Student(111, "Jhon", 29));
		al.add(new Student(222, "Mike", 21));
		al.add(new Student(555, "Mary", 26));
		al.add(new Student(111, "shiva", 35));
		al.add(new Student(333, "shiva", 24));


		Collections.sort(al);
		for(Student st:al) {
			System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());
		}
	}
}
