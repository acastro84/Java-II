import java.awt.*;
import java.awt.event.*;


class Proj05Runner{
	
	public Proj05Runner(){//Print first requirement
		System.out.println(
		  "I certify that this program is my own work \n"+
		  "and is not the work of others. I agree not \n" +
		  "to share my solution with others.\n" +
		  "Armando Castro");
			
		//Proj05Runner gui = new Proj05Runner();//instantiate a GUInterface object
		// Not needed since Proj05 Instantiates Proj05Runner :)
		
		//Create a new Frame object
		Frame displayWindow = new Frame();
		displayWindow.setSize(300,100);  //set the right size changed to 300,100
		displayWindow.setTitle("Armando Castro");  //Name in window requirement

		//Instantiate two Listener objects that will process
		// Window events
		WProc1 winProcCmd1 = new WProc1(displayWindow); //defined
		WProc2 winProcCmd2 = new WProc2(); //overrides with Adapter

		//Register the Listener objects for notification of
		// Window events. This object is the Event Source.
		displayWindow.addWindowListener(winProcCmd1);
		displayWindow.addWindowListener(winProcCmd2);

		//windowActivated and windowOpened test messages
		// are produced here
		displayWindow.setVisible(true);

	}//end constructor
}//end class Proj05Runner GUI definition
//=======================================================//

//The following two classes can be used to instantiate
// Listener objects. Note that this class implements the
// WindowListener interface.  This requires that all the
// methods declared in the interface be overridden in this
// class. This class overrides all of the methods  and
// displays a descriptive message whenever one of the
// methods is called.
class WProc1 implements WindowListener{
	//used to save a reference to the Frame object
	Frame displayWindowRef;

	WProc1(Frame windowIn){//constructor
	// save ref to Frame object
		this.displayWindowRef = windowIn;
	  }//end constructor

	public void windowClosed(WindowEvent e){
		//System.out.println("WProc1 windowClosed test msg");
	}//end windowClosed()

	public void windowIconified(WindowEvent e){
		//System.out.println("Good Night");
	}//end windowIconified()

	public void windowOpened(WindowEvent e){
		//System.out.println("WProc1 windowOpened test msg");
	}//end windowOpened()

	public void windowClosing(WindowEvent e){
		//System.out.println("WProc1 windowClosing test msg");
		displayWindowRef.dispose();//generate WindowClosed
	}//end windowClosing()

	public void windowDeiconified(WindowEvent e){
		//System.out.println("Good Morning");
	}//end windowDeiconified()

	public void windowActivated(WindowEvent e){
		//System.out.println("WProc1 windowActivated test msg");
	}//end windowActivated()

	public void windowDeactivated(WindowEvent e){
		//System.out.println("WProc1 windowDeactivated test msg");
	}//end windowDeactivated()
}//end class WProc1
	
//=======================================================//

//This and the previous class can be used to instantiate
// Listener objects. Note that this class extends an
// Adapter class that can be used to avoid the
// requirement to define all of the methods of the
// actual Listener class named WindowListener. This class
// overrides only two of the methods declared in the
// interface.  It displays a message whenever one of the
// methods is called.
class WProc2 extends WindowAdapter{
	// Decided to put the messages here instead of with WProc1
	public void windowIconified(WindowEvent e){
		System.out.println(
				  "Good Night");
	}//end windowIconified()

	public void windowDeiconified(WindowEvent e){
		System.out.println(
				"Good Morning");
	}//end windowDeiconified()
}//end class WProc2


*/
/*File Proj05 Copyright 2020 R.G.Baldwin
The purpose of this assignment is to assess the student's
ability to write a program dealing with JFrame objects,
window events, and the Delegation Event Model.
***********************************************************
// Student must not modify the code in this file.

public class Proj05 {
  public static void main(String[] args){
    new Proj05Runner();
  }//end main
}//end class Proj05
//========================================================//


*/ 
