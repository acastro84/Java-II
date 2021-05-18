import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*		  
Among other things, the purpose of this assignment is to assess
the student's ability to write a program dealing with window events,
mouse events, and the Delegation Event Model.

PROGRAM SPECIFICATIONS

Beginning with the file that you downloaded named Proj06.java,
create a new file named Proj06Runner.java to meet the specifications given below.

Note that you must not modify the code in the file named Proj06.java.
Be sure to display your name in both locations in the output as indicated.
When you place both files in the same folder, compile them both, and run 
the file named Proj06.java, the program must display the text shown below
on the command line screen.

I certify that this program is my own work
and is not the work of others. I agree not
to share my solution with others.
Replace this line with your name

In addition, your program must display a single
300-pixel by 100-pixel Frame object as shown in the images in assignment file
Proj06.HTML. When you click the mouse in the working area of the Frame, the
coordinates of the mouse pointer must be shown in RED above the mouse pointer.
(Multiple images are shown below to show the result of clicking at different
locations in the working area of the Frame. Note that the 0,0 coordinate location
is at the outer upper-left corner of the Frame, which is beyond the reach of the
mouse pointer.)

When you click the X-button in the upper-right corner of the Frame object,
the program must terminate and MUST RETURN CONTROL TO THE OPERATING SYSTEM.
*/


//Subclass JFrame in order to override the paint method.
class MyFrame extends JFrame{
  int clickX;
  int clickY;

  public void paint(Graphics g){
	Color textColor = Color.RED;
	g.setColor(textColor);
    g.drawString(
             "" + clickX + ", " + clickY, clickX, clickY);
  }//end paint()
}//end class MyFrame
//=======================================================//

//The following class is used to instantiate a;
// graphical user interface object.
class Proj06Runner {
  public Proj06Runner(){//Print first requirement
		System.out.println(
		  "I certify that this program is my own work \n"+
		  "and is not the work of others. I agree not \n" +
		  "to share my solution with others.\n" +
		  "Armando Castro");
		  
		  
    //Create a new JFrame object, set size, title, etc.
    MyFrame displayWindow = new MyFrame();
    displayWindow.setSize(300,100);
    displayWindow.setTitle("Armando Castro");
    displayWindow.setVisible(true);

    //Instantiate and register an anonymous Listener;
    // object which will terminate the program when the;
    // user closes the JFrame.
    displayWindow.addWindowListener(new WProc1());

    //Instantiate and register an anonymous Listener;
    // object that will process mouse events to determine
    // and display the coordinates when the user presses
    // the mouse button in the client area of the JFrame.
    displayWindow.addMouseListener(new MouseProc(displayWindow));
  }//end constructor
}//end class GUI definition
//=======================================================//

//This listener class monitors for mouse presses and;
// displays the coordinates of the mouse pointer when the
// mouse is pressed on the source object. Note that this
// class extends is an adapter class.
class MouseProc extends MouseAdapter {
  MyFrame refToWin; //save a reference to the source here

  MouseProc(MyFrame inWin){//constructor
    refToWin = inWin;//save ref to window
    }//end constructor

  public void mouseDragged(MouseEvent e) {
    refToWin.clickX = e.getX();
    refToWin.clickY = e.getY();
	refToWin.setForeground(Color.red);
	refToWin.repaint();
    }  //end mouseDragged

  //Override the mousePressed method to determine and;
  // display the coordinates when the mouse is pressed.
  public void mousePressed(MouseEvent e){
    //Get X and Y coordinates of mouse pointer and store
    // in an instance variable of the JFrame object
    refToWin.clickX = e.getX();
    refToWin.clickY = e.getY();
	refToWin.setForeground(Color.white);

    //Force the JFrame object to be repainted in order to
    // display the coordinate information.
    refToWin.repaint();
  }//end mousePressed()
}//end class MouseProc
//=======================================================//

//The following listener is used to terminate the program
// when the user closes the frame.  Note that this class
// extends an adapter class.
class WProc1 extends WindowAdapter{
  public void windowClosing(WindowEvent e){
    System.exit(0);
  }//end windowClosing()
}//end class WProc1
//=======================================================//
/
  
  
  /*
  
  /*File Proj06 Copyright 2020 R.G.Baldwin
The purpose of this assignment is to assess the student's
ability to write a program dealing with window events,
mouse events, and the Delegation Event Model.
***********************************************************
// Student must not modify the code in this file.

public class Proj06 {
  public static void main(String[] args){
    new Proj06Runner();
  }//end main
}//end class Proj06
//========================================================//

*/
