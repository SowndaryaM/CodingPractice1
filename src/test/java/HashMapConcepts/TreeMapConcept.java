package HashMapConcepts;

import java.util.*;

public class TreeMapConcept {

	public static void main(String[] args) {
		
		//********** when we are not bothering about sorting we use hashmap and if sorting is used then use Treemap
		TreeMap<Integer, String> map= new TreeMap<Integer, String>();
		
		map.put(1000, "Tom");
		map.put(20000, "Jerry");
		map.put(300, "chinni");
		map.put(1400, "chotu");
		
		//****it is print values in incresing order automatically
		System.out.println(map);
		
		//****to print the values using for each method
		map.forEach((k,v) -> System.out.println("key="+k+" "+"value="+v));
		
		//to print highest salary from the list:
		System.out.println(map.lastKey());
		
		//to print lowest salary from the given list:
		System.out.println(map.floorEntry(20000));//it will give the next highest or equal if mentioned no
		System.out.println(map.firstEntry());
		
		
		//*** give me all the keys which are less than 1500:
		
		SortedMap<Integer, String> keyslessthan1500 = map.headMap(1500);
		System.out.println(keyslessthan1500);
		//or
		Set<Integer> keyslessthan1500k = map.headMap(1500).keySet();
		System.out.println(keyslessthan1500k);
		
		//*** give me all the keys which are greater than 1500:
		Set<Integer> keyslessthan1500k1 = map.tailMap(1500).keySet();
		System.out.println(keyslessthan1500k1);
		
		System.out.println("*************************************************************************************");
		
		
		TreeMap<String, Integer> map1= new TreeMap<String, Integer>();
		map1.put("sowndarya", null);
		map1.put("meghana", 100);
		map1.put("chotu", 50);
		map1.put("chinni", 220);
		map1.put("raghu", 900);
		map1.put("maggie", 1000);
		
		System.out.println(map1);
		
		map1.forEach((k,v) -> System.out.println("Key="+k+" "+"Value="+v) );
		
		// to print in the reverse or descending order:
		TreeMap<String, Integer> map2= new TreeMap<String, Integer>(Comparator.reverseOrder());
		map2.put("sowndarya", null);
		map2.put("meghana", 100);
		map2.put("chotu", 50);
		map2.put("chinni", 220);
		map2.put("raghu", 900);
		map2.put("maggie", 1000);
		
		System.out.println(map2);
		

	}

}
