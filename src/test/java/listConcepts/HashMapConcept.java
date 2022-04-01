package listConcepts;

import java.util.*;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// HashMap is a class implements Map Interface
		//extends AbstarctMap
		// it contains only unique values
		//it stores the values in key and value pairs
		//it may have one null key and multiple null values
		//it maintains no order
		//hashmap is non-synchronized -- not thread safe (it is fast in execution)
		//concurrent modification exception -- Fail - fast condition
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "Parents");
		hm.put(2, null);
		hm.put(3, "childrens");
		hm.put(4, "family");
		
		System.out.println(hm.get(2));
		// to get all the values of map we can use for loop or for each loop:
		//for(Entry<Integer, String>  m: hm.entrySet())
		//or
		for(Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//remove: Key will be removed but it will not shift the key
		hm.remove(2);
		System.out.println(hm);
		
		//to store the employee object:
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		//HashMap<Integer, Employee> here Employee is the class name here we are using as ref variable
		// creating 3 all the Employee class objects:
		Employee e1 = new Employee("Meghana", 27, "QA");
		Employee e2 = new Employee("Sowndarya", 28, "Senior QA");
		Employee e3 = new Employee("Chotu", 29, "dev");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//to fetch all the values use iterate
	
		for(Entry<Integer,Employee> employee:emp.entrySet())
		{
			int key = employee.getKey();
			Employee value = employee.getValue();
			System.out.println(key +" : "+(value.name +" "+ value.age +" "+ value.dept));
			System.out.println(value.name +" "+ value.age +" "+ value.dept);
		}

	}

}
