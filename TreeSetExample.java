//How to create and use a TreeSet

import java.util.*;

class TreeSetExample {

	public static voice main(String[]args)
	{
		TreeSet<String> ts1 = new TreeSet<String>();
		
		
		// Elements are added using add() method
		ts1.add("A");
		ts1.add("B");
		ts1.add("C");
		
		//Duplicates will not get inserted. 
		ts1.add("C");
		
		// Elements get sorted in default natural
		// Sorting order(ascending)
		
		system.out.println(ts1);
		
	}
	
}

