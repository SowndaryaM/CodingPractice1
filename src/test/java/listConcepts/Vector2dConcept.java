package listConcepts;

import java.util.*;

public class Vector2dConcept {

	public static void main(String[] args) {
		
		Vector<String> langVector = new Vector<String>();
		langVector.add("Java");
		langVector.add("Phython");
		langVector.add("c#");
		langVector.add("c++");
		langVector.add("ruby");

		Vector osVector = new Vector();
		osVector.add(langVector);//0 position
		
		for(int i=0;i<=langVector.size()-1;i++)
		{
			String str= (String)((Vector)osVector.get(0)).get(i);
			System.out.println(str);
		}
		
		
	}

}
