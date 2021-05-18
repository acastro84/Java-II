/* File Proj02Runner
This skeleton code will compile but it won't run
because there is some missing code.

According to the contract for the Collections Framework, 
if a given implementation doesn't support a specific method
it must throw an Unsupported OperationException.  Author
of implementation is responsible for providing documentation
that identifies the optional operations that the implementation
does and does not support. 
Java4050 ebook

In order to successfully complete the program for Asg02, 
The student must understand that for a data object to be
eligible for storage in a TreeSet object, the class from 
which the data object is instantiated must implement 
The comparable interface and override the compareTo Method.
Should also override the equals method but that is not required.
For Asg02, the Data Class must also override the toString method
so that the driver class can display the value of the data
stored in the object. 

The main goal here is to create constructors that can
push to an ArrayList collection type and TreeSet collection type
at the same time using runtime polymorphism. 

*****************************************************/
import java.util.*;

class Proj02Runner implements Comparable{
	int data;
	
	Proj02Runner(){//overloaded constructor
	
		data = 0;
		//The purpose of this constructor is to display
		// the certification.
		System.out.println(
			"I certify that this program is my own work \n"+
			"and is not the work of others. I agree not \n" +
			"to share my solution with others.\n" +
			"Replace this line with your name\n");
	}//end overloaded constructor
  
	Proj02Runner(int data){//overloaded constructor
		//The purpose of this constructor is to store
		// the incoming data value
		this.data = data;
		
	}//End parameterized constructor. 
  
	public String toString(){
		return "" + data;
	}//End Overidden toString()
  
	public int compareTo(Object o){
		if(!(o instanceof Proj02Runner))
			throw new ClassCastException();
		if(((Proj02Runner)o).data < data)
			return 1;
		if(((Proj02Runner)o).data > data)
			return -1;
		else return 0;
	}//end compareTo()

	public boolean equals(Object o){
		if(!(o instanceof Proj02Runner))
			return false;
		if(((Proj02Runner)o).data == data)
			return true;
		else return false;
	}//end overridden equals()
}//end Proj02Runner


/*

/*File Proj02.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with runtime polymorphism
and the Comparable interface.
**********************************************************

// Student must not modify the code in this file. //

import java.util.*;
class Proj02{
  public static void main(String[] args){
    
    //Create a pseudo-random number generator
    Random generator = null;
    if(args.length != 0){
      generator = new Random(Long.parseLong(args[0]));
    }else{
      generator = new Random(new Date().getTime());
    };
    
    //Generate some small positive random numbers and
    // save them in an array object of type int..
    int[] vals = {Math.abs(generator.nextInt())%5,
                  Math.abs(generator.nextInt())%5,
                  Math.abs(generator.nextInt())%5,
                  Math.abs(generator.nextInt())%5,
                  Math.abs(generator.nextInt())%5,
                  Math.abs(generator.nextInt())%5
                  };
    //Print certification
    System.out.println();//blank line
    new Proj02Runner();//Call an overloaded constructor.
    
    //Display the data in the vals array.
    for(int cnt = 0;cnt < vals.length;cnt++){
      System.out.print(vals[cnt] + " ");
    }//end for loop
    System.out.println();//blank line
    
    //Create an ArrayList object.
    ArrayList arrayList = new ArrayList();
    
    //Call the student's overloaded constructor
    // several times in succession to populate
    // the ArrayList object.
    for(int cnt=0;cnt < vals.length;cnt++){
      arrayList.add(new Proj02Runner(vals[cnt]));
    }//end for loop

    //Display the data in the ArrayList object
    Iterator iter = arrayList.iterator();
    while(iter.hasNext()){
      System.out.print(iter.next() + " ");
    }//end while loop
    System.out.println();//blank line

    //Create a TreeSet object.
    TreeSet treeSet = new TreeSet();
    
    //Call the student's overloaded constructor
    // several times in succession to populate
    // the TreeSet object.
    for(int cnt=0;cnt < vals.length;cnt++){
      treeSet.add(new Proj02Runner(vals[cnt]));
    }//end for loop

    //Display the data in the TreeSet object
    iter = treeSet.iterator();
    while(iter.hasNext()){
      System.out.print(iter.next() + " ");
    }//end while loop
    System.out.println();//blank line

  }//end main
}//end class Proj02
//End program specifications.

*/
