import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FinalDriver extends JApplet implements ActionListener, KeyListener
{
	Timer time;
	Player emily;
	Player maggie;
	Image maggieStand = getImage(getDocumentBase(), "maggieStand");
	Image emilyStand = getImage(getDocumentBase(), "maggieStand");
	Image [] emilyLeft = new Image[9];
	Image [] maggieLeft = new Image[9];
	public void init()
	{
		setContentPane(new DrawingPanel());
		time = new Timer(10, this);

		for (int i = 0; i < emilyLeft.length; i++)
		{
			emilyLeft[i] = getImage(getDocumentBase(), "");
		}//end for loop

		emily = new Player(50, 400, 50, 100, emilyStand);
		maggie = new Player(900, 400, 50, 100, maggieStand);
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
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			emily.jump();
		}//end if
	}//end key pressed
	public void keyReleased(KeyEvent e)
	{
	}//end key released
}//end public class
