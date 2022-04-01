package SetConcepts;

import java.util.*;

public class EnumSetConcept {
	// ***it is not synchronized
	// **its a highly performance java collector member
	// ***faster than HashSet
	// **all the methods are implemented using bitwise arithmetic operations
	
	enum Lang
	{
		Java,
		CSharp,
		Ruby,
		Phython,
		JavaScript
		
	}
	public static void main(String[] args) {
		//created new enumset using emnu:
		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);
		
		//to create empty enum set:
		EnumSet<Lang> none = EnumSet.noneOf(Lang.class);
		System.out.println(none);
		
		//to create range(e1, e2) set:
		EnumSet<Lang> range = EnumSet.range(Lang.CSharp, Lang.Phython);
		System.out.println(range);
		
		//of method:
		EnumSet<Lang> singleenum= EnumSet.of(Lang.CSharp);
		System.out.println(singleenum);
		
		EnumSet<Lang> multipleenum= EnumSet.of(Lang.CSharp,Lang.Phython);
		System.out.println(multipleenum);
		
		//add and addall():
		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
		
		lang2.add(Lang.JavaScript);
		lang2.addAll(lang1);
		System.out.println(lang2);
		
		System.out.println("********************************");
		//***how to iterate enum set:
		EnumSet<Lang> fulllangs = EnumSet.allOf(Lang.class);
		
		Iterator<Lang> it = fulllangs.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next());
			System.out.print(" , ");
		}
		 
		System.out.println("***************");
		//remove and removeall
		EnumSet<Lang> removename = EnumSet.allOf(Lang.class);
		System.out.println(removename);
		
		removename.remove(Lang.Ruby);
		System.out.println(removename);
		
		removename.removeAll(removename);
		System.out.println(removename);

	}

}
