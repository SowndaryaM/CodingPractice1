package LinkedListConcept;

import java.util.*;

public class LinkedListMethods {

	public static void main(String[] args) {
		// ***LL is a default class in java
		// ***it can be used as Stack, Queue, List
		// ***it allows null entry
		// ***dynamic collection
		// ***hence insertion and deletion can be easily implemented
		// ***it can contain duplicate elements
		// ****it is not synchronized(not thread safe)
		// ****in LL, manipulation is fast because we don't need any shifting

		// ***LL Constructors:

		// LinkedList();
		// LinkedList(Collection C);

		LinkedList<String> ll = new LinkedList<String>();
		System.out.println(ll.size());
		ll.add("Tom");
		ll.add("Jerry");
		ll.add("Java");
		ll.add("ruby");
		ll.add("phython");
		ll.add("c++");
		System.out.println(ll);
		System.out.println(ll.get(1));

		// **to get all the values in the list

		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

		// *** to add names in the middle of the list:
		ll.add(1, "hello");
		System.out.println(ll);

		System.out.println("***********************************************");

		// **** to add additional list to the existing list:

		LinkedList<String> ll1 = new LinkedList<String>();

		ll1.add("peter");
		ll1.add("robin");

		ll.addAll(ll1);
		System.out.println(ll);
		// *** to add all the values from the other list and in that too in the middle
		// of the existing list
		ll.addAll(1, ll1);
		System.out.println(ll);
		
		//***remove:
		ll.remove(3);
		System.out.println(ll);
		
		ll.removeAll(ll1);
		System.out.println(ll);
		
		ll.clear();
		System.out.println(ll);
		
		LinkedList<String> lang = new LinkedList<String>();
		System.out.println(lang.size());
		
		lang.add("Java");
		lang.add("ruby");
		lang.add("phython");
		lang.add("c++");
		System.out.println(lang);
		
		//**reverse the linked list:
	
		Iterator<String> it1 = lang.descendingIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		//** using for each loop:
		for(String str:lang)
		{
			System.out.println(str);
		}
		
		//**sorted order:
		Collections.sort(lang);
		System.out.println(lang);

	}

}
