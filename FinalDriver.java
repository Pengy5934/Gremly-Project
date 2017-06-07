import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FinalDriver extends JApplet implements ActionListener, KeyListener
{
	Timer time;
	Player emily;
	Player maggie;
	Platform Pwall1a, Pwall3a;
	Platform Pfloor1a, Pfloor1b, Pfloor1c, Pfloor1d;
	Platform Pfloor2a, Pfloor2b, Pfloor2c;
	Platform Pfloor4a;
	Platform Pfloor6a, Pfloor6b;
	Platform Pfloor8a;
	Image maggieStand;
	Image emilyStand;
	Image wall1a, wall3a;
	Image floor1a, floor1b, floor1c, floor1d;
	Image floor2a, floor2b, floor2c;
	Image floor4a;
	Image floor6a, floor6b;
	Image floor8a;
	Image laser1, laser3;
	public void init()
	{
		setContentPane(new DrawingPanel());
		time = new Timer(10, this);

		emilyStand = getImage(getDocumentBase(), "maggieStand.png");
		emily = new Player(50, 40, 90, 80, emilyStand, "Emily");
		maggieStand = getImage(getDocumentBase(), "maggieStand.png");
		maggie = new Player(900, 400, 90, 80, maggieStand, "Maggie");
		floor1a = getImage(getDocumentBase(), "floor1.png");
		floor1b = getImage(getDocumentBase(), "floor1.png");
		floor1c = getImage(getDocumentBase(), "floor1.png");
		floor1d = getImage(getDocumentBase(), "floor1.png");
		floor2a = getImage(getDocumentBase(), "floor2.png");
		floor2b = getImage(getDocumentBase(), "floor2.png");
		floor2c = getImage(getDocumentBase(), "floor2.png");
		floor4a = getImage(getDocumentBase(), "floor4.png");
		floor6a = getImage(getDocumentBase(), "floor6.png");
		floor6b = getImage(getDocumentBase(), "floor6.png");
		floor8a = getImage(getDocumentBase(), "floor8.png");
		Pfloor1a = new Platform(200, 220, floor1a, this);
		Pfloor1b = new Platform(1200, 220, floor1b, this);
		Pfloor1c = new Platform(0, 820, floor1c, this);
		Pfloor1d = new Platform(0, 820, floor1d, this);
		Pfloor2a = new Platform(0, 820, floor2a, this);
		Pfloor2b = new Platform(0, 820, floor2b, this);
		Pfloor2c = new Platform(0, 820, floor2c, this);
		Pfloor4a = new Platform(0, 820, floor4a, this);
		Pfloor6a = new Platform(0, 820, floor6a, this);
		Pfloor6b = new Platform(0, 820, floor6b, this);
		Pfloor8a = new Platform(0, 820, floor8a, this);
		addKeyListener(this);
		setFocusable(true);
	}//end init
	public class DrawingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			maggie.draw(g);
			Pfloor1a.draw(g);
			Pfloor1b.draw(g);
			Pfloor1c.draw(g);
			Pfloor1d.draw(g);
			Pfloor2a.draw(g);
			Pfloor2b.draw(g);
			Pfloor2c.draw(g);
			Pfloor4a.draw(g);
			Pfloor6a.draw(g);
			Pfloor6b.draw(g);
			Pfloor8a.draw(g);
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
