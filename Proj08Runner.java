/* Ok so just some observations on the Professor's version of this file.  
/ Coordinates hover.  How does he get them to hover. 
// It is 1 frame.  But I think we know how to do this now bc of his Proj07 File.  

//When holding any click down, starting with the hovered coordinates:
	Coords continue to hover, but are now in red text. 
	When you let go of mouse button, a final released coordinate is displayed.  You cannot move after releasing this, 
	or you will not see the red text. 
	
	After moving from the released coord, text turns back to black and continues to hover. 
	
	When you exit the client section of the panel, the coordinate the hover was at when the mouse exit event fired
	is displayed until you enter the client section again. 
	
	
	You cannot enter the area already holding the click down. 
*/

// Let's start with what works. 
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class Proj08Runner extends JFrame implements MouseMotionListener {
	boolean mouseDragged;
	long currentTime;
	int mx, my;
	
	public Proj08Runner() {
		this.setTitle("Armando Castro");
		setSize(300, 100);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseMotionListener(this);
		requestFocus();
		getContentPane().setBackground(Color.WHITE);
		currentTime = System.currentTimeMillis();
		System.out.println("I certify that this program is my own work");
		System.out.println("and is not the work of others. I agree not");
		System.out.println("to share my solution with others.");
		System.out.println("Armando Castro");
		System.out.println();
	}
	

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		if(my > getHeight() - 10) {
			my = getHeight() - 10;
		}
		if(mx < 4) {
			mx = 4;
		}
		if(mouseDragged) {
			g.setColor(Color.red);
		}
		else {
			g.setColor(Color.black);
		}
		g.drawString(String.format("%d, %d",  mx, my), mx, my);

	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
		mx = e.getX();
		my = e.getY();

		mouseDragged = true;
		long t = System.currentTimeMillis();
		if(t > currentTime + 100) {
			repaint();
			currentTime = t;
		}
		e.consume();
	}
	
	
	@Override
	public void mouseMoved(MouseEvent e) {
		
		mx = e.getX();
		my = e.getY();

		mouseDragged = false;
		long t = System.currentTimeMillis();
		if(t > currentTime + 100) {
			repaint();
			currentTime = t;
		}
		e.consume();
	
	}
	
}


/*

/*File Proj08.java Copyright 2002 R.G.Baldwin
The purpose of this assignment is to assess the student's
ability to write a program dealing with Frame objects,
MouseMoved events, MouseDragged events, and the Delegation
Event Model.
*********************************************************
import java.awt.Frame;
public class Proj08 {
  public static void main(String[] args){
    Frame aFrame = new Proj08Runner();
  }//end main
}//end class Proj08

*/

