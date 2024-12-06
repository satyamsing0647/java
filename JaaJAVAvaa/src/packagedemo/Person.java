package packagedemo;

import java.util.Objects;

/**
* Auhtor : Satyam.3.Singh
* Date   : 4 Nov 2024
* Time   : 4:47:04 pm
* Email  : satyam.3.singh@coforge.com
* 
* program to demonstrate methods of object class.
* 
*/

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
		
	}
	
	 //Overriding toString method of object class
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	//check wether the contents are equal or not
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	
}
