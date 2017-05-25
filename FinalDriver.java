import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FinalDriver extends JApplet implements ActionListener, KeyListener
{
	Timer time;
	Player emily;
	Player maggie;
	public void init()
	{
		getContentPane(new DrawingPanel());
		time = new Timer(10, this);
		emily = new Player(50, 400, /*Image[]*/);
	}//end init
	public class DrawingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
		}//end paint component
	}//end drawing panel
	public void actionPerformed(ActionEvent e)
	{
	}//end action performed
	public void keyTyped(KeyEvent e)
	{
	}//end key typed
	public void keyPressed(KeyEvent e)
	{
	}//end key pressed
	public void keyReleased(KeyEvent e)
	{
	}//end key released
}//end public class

