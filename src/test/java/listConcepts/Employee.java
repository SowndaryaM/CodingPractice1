package listConcepts;

public class Employee {
	// these are global variables
	String name;
	int age;
	String dept;

	Employee(String name, int age, String dept) {
		// in order to use same name as global variables inside the method we should use
		// this keyword
		this.name = name;
		this.age = age;
		this.dept = dept;

	}

}
