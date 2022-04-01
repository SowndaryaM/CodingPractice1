package listConcepts;

import java.util.*;

public class VectorConcepts {

	public static void main(String[] args) {
		
		Vector<Integer> myVector = new Vector<Integer>();
		myVector.add(10);
		myVector.add(20);
		myVector.add(30);
		myVector.add(40);
		myVector.add(50);
		
		System.out.println(myVector);
		
		System.out.println(myVector.get(3));
		
		System.out.println(myVector.remove(1));
		System.out.println(myVector);
		
		Vector<Integer> yourVector = new Vector<Integer>();
		yourVector.add(100);
		yourVector.add(200);
		yourVector.add(300);
		yourVector.add(400);
		yourVector.add(500);
		
		myVector.addAll(yourVector);
		System.out.println(myVector);
		
		for(int i: myVector)
		{
			System.out.println(i);
		}
		
		for(int i=0;i<=myVector.size()-1;i++)
		{
			System.out.println(myVector.get(i));
		}
		
		Iterator<Integer> it= myVector.iterator();
		while(it.hasNext())
			
		{
			
			
			System.out.println(it.next() );
		}
		
		//
		Collections.sort(myVector);
		System.out.println(myVector);

	}

}
