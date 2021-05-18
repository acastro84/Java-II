import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Proj07Runner extends JFrame implements MouseListener {

	//to remove the warning
	private static final long serialVersionUID = 1L;
	
	//a panel that is clicked by mouse
	private JPanel panel;
	
	//label of mouse location
	private JLabel mouseLocLbl;

	public Proj07Runner() {
		System.out.println(
				"I certify that this program is my own work \n" + "and is not the work of others. I agree not \n"
						+ "to share my solution with others.\n" + "Armando Castro");

		panel = new JPanel();
		panel.setLayout(null);
		//panel.setBackground(Color.RED);
		
		//initialize the frame
		createAndShowGUI();
		
		//add pane to frame
		add(panel);	
	
		//add mouse listener
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		//System.out.println("Mouse Clicked at X: " + x + " - Y: " + y);
		//System.out.println("getWidth() - 50: " + (getWidth() - 100));
		
		if (mouseLocLbl != null) {
			panel.remove(mouseLocLbl);
		}
		
		mouseLocLbl = new JLabel(x + "," + y);
		mouseLocLbl.setBackground(Color.RED);
		
		//location to put label
		int labelX = x - 20;
		int labelY = y - 50;
		
		//validate the position
		if (labelX < 0) {
			labelX = 0;
		}else if (labelX > getWidth() - 70) {
			labelX = getWidth() - 70;
		}
		if (labelY < 0) {
			labelY = 0;
		}
		
		mouseLocLbl.setBounds(labelX, labelY, 100, 10);
		panel.add(mouseLocLbl);
		
		invalidate();
		validate();
		repaint();
	}

	public void mouseEntered(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		// System.out.println("Mouse Entered frame at X: " + x + " - Y: " + y);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		// System.out.println("Mouse Exited frame at X: " + x + " - Y: " + y);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		// System.out.println("Mouse Pressed at X: " + x + " - Y: " + y);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

	}

	private void createAndShowGUI() {

		// Create and set up the window.

		setSize(300, 100);

		// Display the window.

		setVisible(true);
		setTitle("Armando Castro");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}


*/
/*File Proj07.java Copyright 2002 R.G.Baldwin
The purpose of this assignment is to assess the student's
ability to write a Swing program handling mouse events on
a JFrame object containing a JPanel object.
*********************************************************

public class Proj07 {
  public static void main(String[] args){
    new Proj07Runner();
  }//end main
}//end class Proj07
//=======================================================//

*/

/*

My attempt was graded incorrectly.  I did not build the interface how he wanted

Here is the correct Proj07Runner.java as presented by my professor.  


/*File Proj07Runner.java Copyright 2002 R.G.Baldwin

*********************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Proj07Runner {

	public Proj07Runner(){//constructor
		
  
		JFrame theFrame = new JFrame();
		theFrame.setSize(300,100);
		theFrame.setTitle("Display your name here");

		DisplaySpace displayWindow = new DisplaySpace();
		theFrame.setBackground(Color.green);
		theFrame.getContentPane().add(displayWindow,"Center");
		

		System.out.println("I certify that this program is my own work");
		System.out.println("and is not the work of others. I agree not");
		System.out.println("to share my solution with others.");
		System.out.println("Print your name here.");
		System.out.println();

		displayWindow.setForeground(Color.BLACK);

		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		theFrame.setVisible(true);

		//Instantiate and register a Listener object that will
		// process mouse events to determine and display the
		// coordinates when the user presses the mouse button
		// on the JPanel.
		displayWindow.addMouseListener(new MProc1(displayWindow));
	}//end constructor
	//=======================================================//
	//Begin inner class definitions

	private class DisplaySpace extends JPanel{

		int clickX;
		int clickY;
		
		

		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString("" + clickX + ", " + clickY, clickX, clickY);
		}//end paintComponent
	}//end class DisplaySpace
	//=======================================================//
	//This listener class monitors for mouse presses and
	// displays the coordinates of the mouse pointer when the
	// mouse is pressed.
	private class MProc1 extends MouseAdapter{
		DisplaySpace refToWin;

		MProc1(DisplaySpace inWin){//constructor
		refToWin = inWin;//save ref to window
		}//end constructor
		
		public void mouseMoved(MouseEvent e){
		
		}//end mousePressed()

		//Override the mousePressed method to determine and
		// display the coordinates when the mouse is pressed.
		public void mousePressed(MouseEvent e){
			//Get X and Y coordinates of mouse pointer
			// and store in the JFrame object.
			refToWin.clickX = e.getX();
			refToWin.clickY = e.getY();
			refToWin.repaint();//display coordinate information
		}//end mousePressed()
		
		public void mouseReleased(MouseEvent e){
			//Get X and Y coordinates of mouse pointer
			// and store in the JFrame object.
			refToWin.clickX = e.getX();
			refToWin.clickY = e.getY();
			refToWin.repaint();//display coordinate information
		}//end mousePressed()
		
		public void mouseEntered(MouseEvent e){
			//Get X and Y coordinates of mouse pointer
			// and store in the JFrame object.
			refToWin.clickX = e.getX();
			refToWin.clickY = e.getY();
			refToWin.repaint();//display coordinate information
		}//end mousePressed()
		
		public void mouseExited(MouseEvent e){
			//Get X and Y coordinates of mouse pointer
			// and store in the JFrame object.
			refToWin.clickX = e.getX();
			refToWin.clickY = e.getY();
			refToWin.repaint();//display coordinate information
		}//end mousePressed()
		
		
		public void mouseDragged(MouseEvent e){
			//Get X and Y coordinates of mouse pointer
			// and store in the JFrame object.
			refToWin.clickX = e.getX();
			refToWin.clickY = e.getY();
			refToWin.repaint();//display coordinate information
		}//end mousePressed()
		
		
	}//end class MProc1
}//end GUI class
//======================================================//

*/
