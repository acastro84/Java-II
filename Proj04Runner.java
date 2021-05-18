/*Proj04Runner.java

When you place both files in the same folder, compile them both, and run the file named Proj04.java with a command-line argument of 6, the program must display the text shown below on the command line screen.

I certify that this program is my own work
and is not the work of others. I agree not
to share my solution with others.
Print your name here.

seed = 6
Input:  chris chris Chris Chris Don ann don Ann
Intermediate Results: ann chris Don
Final Results:        chris ann Don
Your output text must match my output text for a command-line argument of any numeric value that you choose. Run your program and my program side by side with different command-line-arguments to confirm that they match before submitting your program. For example, the following text shows the output text created by running my program six times in succession for command-line argument values of 1 through 6 respectively. (Note that I deleted the certification text from each output to conserve space.)

seed = 1
Input:  chris Bill Chris Chris Don don don Bill
Intermediate Results: Bill chris Don
Final Results:        chris Don Bill

seed = 2
Input:  bill Don chris don don bill ann Ann
Intermediate Results: ann bill chris Don
Final Results:        chris bill ann Don

seed = 3
Input:  Ann Chris chris don don chris chris Bill
Intermediate Results: Ann Bill Chris don
Final Results:        don Chris Bill Ann

seed = 4
Input:  ann Ann Ann Don Don don Chris Chris
Intermediate Results: ann Chris Don
Final Results:        ann Don Chris

seed = 5
Input:  Ann ann Ann Bill don bill Chris Ann
Intermediate Results: Ann Bill Chris don
Final Results:        don Chris Bill Ann

seed = 6
Input:  chris chris Chris Chris Don ann don Ann
Intermediate Results: ann chris Don
Final Results:        chris ann Don
Press any key to continue . . .
When you place both files in the same folder, compile them both, and run the file named Proj04.java without a command-line argument, the program must display text that is similar to, but not necessarily the same as the text shown below on the command line screen. In this case, the input names are based on a random number generator that will change from one run to the next because the seed is based on the date and time.

I certify that this program is my own work
and is not the work of others. I agree not
to share my solution with others.
Print your name here.

seed = 1587598279742
Input:  Ann don Ann Ann Ann don Bill Bill
Intermediate Results: Ann Bill don
Final Results:        don Bill Ann

*/

import java.util.*;
import java.io.Serializable;

class Proj04Runner extends TheComparator{
	private TreeSet setArray; 
	Proj04Runner(){//overloaded constructor

	//The purpose of this constructor is to display
	// the certification.
	System.out.println(
		"I certify that this program is my own work \n"+
		"and is not the work of others. I agree not \n" +
		"to share my solution with others.\n" +
		"Armando Castro\n");
	}

	public Object[] runA(Object[] data){
		this.setArray = new TreeSet(new TheComparator()); 
		this.setArray.addAll(Arrays.asList(data));
		return setArray.toArray();
	}

	public TreeSet runB() {
		TreeSet bTree = new TreeSet(new ReverseComparator()); 
		bTree.addAll(this.setArray);
		return bTree;
	}

	public class runner extends Proj04Runner{

		Object ref2 = new Proj04Runner();

		public runner(Object[] s) {
			runA(s);
		}

		public runner() {
			runB();
		}

	}
}


class TheComparator implements Comparator{

  public int compare(Object o1,Object o2){
    if(!(o1 instanceof String))
        throw new ClassCastException();
    if(!(o2 instanceof String))
        throw new ClassCastException();

    int result = ((String)o1).compareToIgnoreCase(((String)o2));
    return result;
  }//end compare()

  public boolean equals(Object o){
    if(!(o instanceof TheComparator))
        return false;
    else return true;
  }//end overridden equals()
}//end class TheComparator


class ReverseComparator implements Comparator{

  public int compare(Object o1,Object o2){
    if(!(o1 instanceof String))
        throw new ClassCastException();
    if(!(o2 instanceof String))
        throw new ClassCastException();

    int result = ((String)o2).compareTo(((String)o1));
    return result;
  }//end compare()

  public boolean equals(Object o){
    if(!(o instanceof TheComparator))
        return false;
    else return true;
  }//end overridden equals()
}//end class TheComparator




/*

Proj04.java

/*File Proj04 Copyright 2008 R.G.Baldwin
The purpose of this assignment is to assess the student's
ability to write a program dealing with sorting, arrays, 
and collections.
**********************************************************
// Student must not modify the code in this file.

import java.util.*;

class Proj04{
  //Create an array containing names that will be used
  // later.
  static String[] names = 
  {"Don","don","Bill","bill","Ann","ann","Chris","chris"};
  
  //Create an empty array that will be populated with
  // randomly selected names and used later.
  static Object[] myArray = new String[8];
  
  //Begin the main method
  public static void main(String args[]){

    //Instantiate a new object of the student's class
    // and display the certification.
    Proj04Runner runner = new Proj04Runner();
    
    //Create a pseudo-random number generator
    Random generator = null;
    if(args.length != 0){
      //User entered a command-line argument. Use it
      // for the seed.
      System.out.println("seed = " + args[0] );
      generator = new Random(Long.parseLong(args[0]));
    }else{
      //User did not enter a command-line argument.
      // Get a seed based on date and time.
      long seed = new Date().getTime();
      System.out.println("seed = " + seed);
      generator = new Random(new Date().getTime());
    };
    
    //Create and display the data for input to the class
    // named Proj04Runner.
    System.out.print("Input:  ");
    for(int cnt = 0;cnt < myArray.length;cnt++){
      int index = ((byte)generator.nextInt())/16;
      if(index < 0){
        index = -index;
      }//end if
      if(index >= 8){
        index = 7;
      }//end if
      myArray[cnt] = names[index];
      System.out.print(myArray[cnt] + " ");
    }//end for loop
    System.out.println();//new line

    //Process the data, get, and display intermediate
    // results.
    myArray = runner.runA(myArray);
    
    System.out.print("Intermediate Results: ");
    for(int cnt = 0; cnt<myArray.length;cnt++){
      System.out.print(myArray[cnt] + " ");
    }//end for loop
    System.out.println();

    //Finish processing the data, get, and display
    // final results.
    Collection collection = runner.runB();
 
    System.out.print("Final Results:        ");
    Iterator iter = collection.iterator();
    while(iter.hasNext()){
      System.out.print(iter.next() + " ");
    }//end while loop
    System.out.println();

  }//end main()
  //----------------------------------------------------//

}//end class Proj04
*/
