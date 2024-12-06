package map.demo;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 6 Nov 2024
 * Time   : 10:56:38 am
 * Email  : satyam.3.singh@coforge.com
 */

public class TreeMapDemo1 {

	public static void main(String[] args) {

		TreeMap<String,String> fileExtensions=new TreeMap<>();

		// Adding new key-value pairs to a TreeMap
		fileExtensions.put("python", ".py");
		fileExtensions.put("c++", ".cpp");
		fileExtensions.put("kotlin", ".kt");
		fileExtensions.put("golang", ".go");
		fileExtensions.put("java", ".java");

		//Tree map will be sorted based on keys
		System.out.println(fileExtensions);

		TreeMap<String,String> fileExtensions1=new TreeMap<String,String>(Comparator.reverseOrder());

		// Adding new key-value pairs to a TreeMap
		fileExtensions1.put("python", ".py");
		fileExtensions1.put("c++", ".cpp");
		fileExtensions1.put("kotlin", ".kt");
		fileExtensions1.put("golang", ".go");
		fileExtensions1.put("java", ".java");

		//Tree map will be sorted based on keys in descending order
		System.out.println(fileExtensions1);
	}
}
