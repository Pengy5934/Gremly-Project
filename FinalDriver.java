import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FinalDriver extends JApplet implements ActionListener, KeyListener
{
	Timer time;
	Player emily;
	Player maggie;
	Platform bottom;
	Image maggieStand;
	Image emilyStand;
	public void init()
	{
		setContentPane(new DrawingPanel());
		time = new Timer(10, this);

		emilyStand = getImage(getDocumentBase(), "maggieStand.png");
		emily = new Player(50, 40, 90, 80, emilyStand, "Emily");
		maggieStand = getImage(getDocumentBase(), "maggieStand.png");
		maggie = new Player(900, 400, 90, 80, maggieStand, "Maggie");
		bottom = new Platform(0, 900, 1000, 100, 1);

		addKeyListener(this);
		setFocusable(true);
	}//end init
	public class DrawingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			maggie.draw(g);
		}//end paint component
	}//end drawing panel
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}//end action performed
	public void keyTyped(KeyEvent e)
	{
	}//end key typed
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			maggie.walkRight();
			repaint();
		}//end if
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			maggie.walkLeft();
			repaint();
		}//end if
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			maggie.jump();
			repaint();
		}//end if
	}//end key pressed
	public void keyReleased(KeyEvent e)
	{
	}//end key released
}//end public class
