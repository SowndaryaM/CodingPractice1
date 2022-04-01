package SetConcepts;

import java.util.*;

public class HashSetConcept {
	// ** it wont allow to store duplicate values
	// ** if we add duplicate values it will show once if add while run time

	public static void main(String[] args) {
		// ***Hash set is the implementation of set interface
		// **in interface not able to create object:

		Set<String> hs = new HashSet<String>();

		hs.add("Alpha");
		hs.add("Beta");
		hs.add("lambda");
		hs.add("Alpha");
		hs.add(null);

		System.out.println(hs);
		System.out.println(hs.contains("Alpha"));
		//
		for (String str : hs) {
			System.out.println(str);
		}
		//
		hs.remove("Alpha");
		System.out.println(hs);

		//
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("*****************************************");

		Set<Integer> first = new HashSet<Integer>();
		// *** to add all the values at a time
		first.addAll(Arrays.asList(new Integer[] { 1, 2, 4, 7, 3, 8 }));

		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] { 5, 6, 7, 8, 9, 10, 11 }));

		// get union:

		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);

		// ***get the intersection: to get all the common elements

		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);

		// ***get the differences:

		Set<Integer> diff = new HashSet<Integer>(second);
		diff.removeAll(first);// ***the elements which are common will be removed from second set and it will
								// show the second set results after removing
		System.out.println(diff);

	}

}
