import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FinalDriver extends JApplet implements ActionListener, KeyListener
{
	Timer time;
	Player emily;
	Player maggie;
	Platform bottom, midair, midair2;
	Image maggieStand;
	Image emilyStand;
	int timerTick = 0;
	boolean jumping = false;
	JLabel location;
	Container c;
	public void init()
	{
		setContentPane(new DrawingPanel());
		c = getContentPane();
		time = new Timer(100, this);

		emilyStand = getImage(getDocumentBase(), "maggieStand.png");
		emily = new Player(50, 40, 90, 80, emilyStand, "Emily");
		maggieStand = getImage(getDocumentBase(), "maggieStand.png");
		maggie = new Player(900, 600, 90, 80, maggieStand, "Maggie");
		bottom = new Platform(0, 900, 1300, 50);
		midair = new Platform(700, 700, 200, 30);
		midair2 = new Platform(500, 700, 200, 30);
		location = new JLabel(maggie.getX() + ", " + maggie.getY());
		c.add(location);

		addKeyListener(this);
		setFocusable(true);
		time.start();
	}//end init
	public class DrawingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);

			bottom.draw(g);
			midair.draw(g);
			midair2.draw(g);

			maggie.draw(g);

		}//end paint component
	}//end drawing panel
	public void actionPerformed(ActionEvent e)
	{
		if (time.isRunning())
		{
			timerTick++;
			location.setText(maggie.getX() + ", " + maggie.getY() + ", " + timerTick);
			bottom.floor(maggie);
			midair.floor(maggie);
			midair2.floor(maggie);
			midair.ceiling(maggie);
			midair2.ceiling(maggie);
			if (jumping == false)
			{
				maggie.fall();
			}//end if
		}
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
			jumping = true;
			repaint();
		}//end if
		if (e.getKeyCode() == KeyEvent.VK_U)
		{
			time.stop();
		}//end if
	}//end key pressed
	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			maggie.stopRight();
			repaint();
		}//end if
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			maggie.stopLeft();
			repaint();
		}//end if
	}//end key released
	public void endJump()
	{
		jumping = false;
	}
}//end public class
