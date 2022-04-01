package listConcepts;

import java.util.*;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("raghu");
		ll.add("chinni");
		ll.add("chotu");
		ll.add("kid");
		
		//print:
		System.out.println(ll);
		
		//add first element and last element to the list
		ll.addFirst("manager");
		ll.addLast("meghs");
		System.out.println(ll);
		
		//get and set methods
		ll.get(0);
		System.out.println(ll.get(0));
		ll.set(0, "meghs");
		System.out.println(ll.get(0));
		
		//remove():
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		
		//how to print all the values of liked list:
		//using for loop
		System.out.println("using for loop**********");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		//using advanced for loop or for each loop
		System.out.println("using for each**********");
		for(String str:ll)
		{
			System.out.println(str);
		}
		
		//using iterator
		System.out.println("using iterator**********");
		Iterator<String>  list= ll.iterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		
		//using while loop
		System.out.println("using while loop**********");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
		
		

	}

}
