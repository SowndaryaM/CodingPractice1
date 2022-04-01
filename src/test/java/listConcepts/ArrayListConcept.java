package listConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		int[] a = new int[3];// static array and here size is fixed

		// dynamic array--Array list:
		// 1. can contain duplicate values/elements
		// 2. maintains insertion order[ means it all the values automatically it will
		// store by default from 0 to n-1]
		// 3. Synchronized
		// 4. allows random access to fetch the element because it stores the values on
		// the basis of indexes

		ArrayList ar = new ArrayList();// this is called as non generic array list since we have not used any specific
										// data type

		ar.add(100);
		ar.add("tom");
		ar.add('c');
		ar.add(100);// it allows to add duplicate values
		System.out.println(ar.get(3));

		// inorder to get all the values of array list or from any list we should use:
		// for loop
		// 1. for loop
		// 2. using iterator

		for (int i = 0; i <= ar.size() - 1; i++) {
			System.out.println(ar.get(i));
		}

		System.out.println("*********************************************************");

		// non generic vs generic concepts:

		ArrayList ar1 = new ArrayList();// this is called as non generic array list since we have not used any specific
										// data type

		ArrayList<Integer> ar2 = new ArrayList<Integer>();// this is called as generic array list since we have not used
															// any specific data type
		ar2.add(100);
		System.out.println("**************************");

		// if we are not sure what is the return type then we should use "E" as data
		// type or if it is not working use "Object" as the data type

		ArrayList<Object> array = new ArrayList<Object>();
		array.add("Abc");
		array.add(123);
		array.add("Xyz");
		System.out.println(array.size());
		for (int j = 0; j <= array.size() - 1; j++) {
			System.out.println(array.get(j));
		}

		System.out.println("*****************************************************");
		// Note: in order to store different data types and different employee
		// details(name,age and dep at a time) we need to create an object and we can
		// use the array list

		// creating 3 all the Employee class objects:
		Employee e1 = new Employee("Meghana", 27, "QA");
		Employee e2 = new Employee("Sowndarya", 28, "Senior QA");
		Employee e3 = new Employee("Chotu", 29, "dev");

		// create a array list of Employee object

		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);// this will store all 3 values and all three employee details in the array list
		ar4.add(e2);
		ar4.add(e3);

		// we need to use iterator in order to retrieve the employee details

		Iterator<Employee> it = ar4.iterator();

		// Note:
		// 1. here in order to retrieve the values we can not use for loop since values
		// are stored as an object
		// 2.Iterator will return only object values which are stored in the form of
		// indexes (0 to n-1);
		// 3. we need to use while loop here

		while (it.hasNext())// it.hasnext() will check any value or element is present in the array list or
							// not and it returns true if element present
		{
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);

		}
		
		System.out.println("**********************************************************************");
		
		//addAll() :
		ArrayList<Object> array1 = new ArrayList<Object>();
		array1.add("Abc");
		array1.add(123);
		array1.add("Xyz");
		
		ArrayList<Object> array2 = new ArrayList<Object>();
		array2.add("Abc");
		array2.add(123);
		array2.add("Xyz");
		
		array1.addAll(array2);
		
		for (int i=0;i<=array1.size()-1;i++)
		{
			System.out.println(array1.get(i));
		}
		
		System.out.println("****************************************************************");
		
		//retainAll() : it will returns only what is matching by comparing both the lists
		ArrayList<Object> array3 = new ArrayList<Object>();
		array3.add("Abc");
		array3.add(123);
		array3.add("Xyz");
		
		ArrayList<Object> array4 = new ArrayList<Object>();
		array4.add("Abc");
		array4.add(123);
		array4.add("chotu");
		
		array3.retainAll(array4);
		
		for (int i=0;i<=array3.size()-1;i++)
		{
			System.out.println(array3.get(i));
		}
		
		System.out.println("****************************************************************");
		
		// removeAll: this will removes the list added extra or appended list
	}

}
