import java.util.*;


public class Proj01Runner
{
	// passed collection from the user.
    ArrayList<Integer> ref;
    
	

    //vals from Proj01 and int[] to allow ArrayList to pass if already stored right?
	public Proj01Runner(int[] vals) 
	{
		
		System.out.println(
          "I certify that this program is my own work \n"+
		  "and is not the work of others. I agree not \n" +
          "to share my solution with others.\n" +
          "Armando Castro\n");
		
		ref = new ArrayList<>(); //Should instantiate object, but doesnt
		for(int i:vals)
		{
			ref.add(i);  // add values from vals, or add values from int[]?
		}
	}

	//used if user needs a collection 
	public Collection<Integer> runA() 
	{
		return ref;		//Is this what instantiates my object?
	}
  
	//used if user wants a sorted order.  This doesnt happen automatically like C++
	public Collection<Integer> runB() 
	{
		ArrayList<Integer> ref2 = new ArrayList<>();
		for(int i:ref)
		{
			if(!ref2.contains(i))		//duplicates
			{
				ref2.add(i);
			}
		}
		Collections.sort(ref2);
		return ref2;
	}
}



/*
/*File Proj01.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with basic Collection
Framework concepts and methods.
**********************************************************

// Student must not modify the code in this file. //

import java.util.*;
class Proj01{
  public static void main(String[] args){
    
    //Create a pseudo-random number generator
    Random generator = null;
    if(args.length != 0){
      generator = new Random(Long.parseLong(args[0]));
    }else{
      generator = new Random(new Date().getTime());
    };
    
    //Generate some small positive random numbers and store
    // them in an array object of type int.
    int[] vals = {Math.abs(generator.nextInt())%5,
                  Math.abs(generator.nextInt())%5,
                  Math.abs(generator.nextInt())%5,
                  Math.abs(generator.nextInt())%5,
                  Math.abs(generator.nextInt())%5,
                  Math.abs(generator.nextInt())%5
                  };
    System.out.println();//blank line
    
    //Instantiate an object from the student's code.
    // Pass the vals array as a parameter.
    Proj01Runner obj = new Proj01Runner(vals);
    
    //Display the data in the vals array.
    for(int cnt = 0;cnt < vals.length;cnt++){
      System.out.print(vals[cnt] + " ");
    }//end for loop
    System.out.println();//blank line
    
    //Call the runA method on the student's object. Store
    // the return value in a reference variable named ref
    // of type Collection.
    Collection ref = obj.runA();

    //Display the return values from the runA method
    Iterator iter = ref.iterator();
    while(iter.hasNext()){
      System.out.print(iter.next() + " ");
    }//end while loop
    System.out.println();//blank line

    //Call the runB method on the student's object. Store
    // the return value in the reference variable named ref
    // of type Collection.
    ref = obj.runB();
    
    //Display the return values and the sum of the
    // return values from the runB method
    int sum = 0;
    iter = ref.iterator();
    while(iter.hasNext()){
      Integer myObj = (Integer)(iter.next());
      System.out.print(myObj + " ");
      sum += myObj.intValue();
    }//end while loop
    
    System.out.println("\nSum = " + sum);

    System.out.println();//blank line

  }//end main
}//end class Proj01
//End program specifications.
*/
