package newfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
* Auhtor : Satyam.3.Singh
* Date   : 9 Nov 2024
* Time   : 12:30:29 pm
* Email  : satyam.3.singh@coforge.com
*/

public class StreamExample1 {
	
	public static void main(String[] args) {
		
		Integer[] marks= {45,88,99,45,75,23};
		
		Stream<Integer> strm=Stream.of(marks);
		
		strm.forEach(System.out::println);
		
		List<Integer> grades=new ArrayList<Integer>();
		
		grades.add(10);
		grades.add(6);
		grades.add(5);
		grades.add(7);
		grades.add(8);
		grades.add(9);
		
		Stream<Integer> strm1=grades.stream();
		
		System.out.println("********* ArrayList Contents **********");
		strm1.forEach(System.out::println);
		
		List<Integer> squares=grades.stream().map(m -> m*m).collect(Collectors.toList());
		
		System.out.println("********* Double of grades **************");
		System.out.println(squares);

	}
}
