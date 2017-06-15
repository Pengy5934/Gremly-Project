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

		emilyStand = getImage(getDocumentBase(), "emilyStand.png");
		emily = new Player(50, 600, 90, 80, emilyStand, "Emily");
		maggieStand = getImage(getDocumentBase(), "maggieStand.png");
		maggie = new Player(900, 600, 90, 80, maggieStand, "Maggie");
		bottom = new Platform(0, 820, getImage(getDocumentBase(), "floor8.png"), this);
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

			maggie.draw(g);
			emily.draw(g);

		}//end paint component
	}//end drawing panel
	public void actionPerformed(ActionEvent e)
	{
		if (time.isRunning())
		{
			timerTick++;
			location.setText(maggie.getX() + ", " + maggie.getY() + ", " + timerTick);
			bottom.floor(maggie);
			bottom.floor(emily);
			if (jumping == false)
			{
				maggie.fall();
				emily.fall();
			}//end if
		}//end if
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
		if (e.getKeyCode() == KeyEvent.VK_A)
		{
			emily.walkLeft();
			repaint();
		}//end if
		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			emily.walkRight();
			repaint();
		}//end if
		if (e.getKeyCode() == KeyEvent.VK_W)
		{
			emily.jump();
			repaint();
		}//end if
		if (e.getKeyCode() == KeyEvent.VK_U)
		{
			time.stop();
		}//end if
		if (e.getKeyCode() == KeyEvent.VK_Y)
		{
			time.start();
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
		if (e.getKeyCode() == KeyEvent.VK_A)
		{
			emily.stopLeft();
			repaint();
		}//end if
		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			emily.stopRight();
			repaint();
		}//end if
	}//end key released
	public void endJump()
	{
		jumping = false;
	}
}//end public class
