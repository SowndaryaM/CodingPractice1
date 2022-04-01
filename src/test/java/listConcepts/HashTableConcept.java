package listConcepts;

import java.util.*;

public class HashTableConcept {

	public static void main(String[] args) {
		//it is similar to hashmap, but it is synchronised.
		//stores the value on basis of key -value
		//key is specified as an Object and each object has an one HashCode on this hashcode the value will be stored

		Hashtable ht1 = new Hashtable();
		ht1.put(1, "Tom");
		ht1.put(2, "jerry");
		ht1.put(3, "java");
		ht1.put(1, "Tom");// it should contain only unique values
		//no null key n null values
		//ht1.put(null, "Too");//null pointer exception
		
		
		//create a clone copy or shallow copy:
		Hashtable ht2 = new Hashtable();
		ht2= (Hashtable)ht1.clone();
		
		System.out.println("the values from ht1 object"+ ht1);
		System.out.println("the values from ht2 object"+ ht2);
		
		
		//clear:
		//ht1.clear();
		System.out.println("the values from ht1 object"+ ht1);
		System.out.println("the values from ht2 object"+ ht2);
		
		//contains:
		if(ht2.contains("Tom"))
		{
			System.out.println("value is available");
		}
		
		//how to print all the values using enumeration:
		Enumeration e = ht2.elements();
		System.out.println("print the values from the ht2");
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//to get the values using entrySet()
		
		Set s= ht2.entrySet();
		System.out.println(s);
		
		//to check both the hashtables are equal or not:
		
		if(ht1.equals(ht2))
		{
			System.out.println("both are equal");
		}
		
		//get the value using key:
		System.out.println(ht1.get(2));
		
		//get the value of the hash code:
		System.out.println("the hashcode value of ht1: " +ht1.hashCode()+" it is 32 bit integer no");
		
		//generics:
		Hashtable<String, String> st = new Hashtable<String, String>();
	}

	
}
