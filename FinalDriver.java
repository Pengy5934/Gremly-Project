import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FinalDriver extends JApplet implements ActionListener, KeyListener
{
	Timer time;
	Player emily;
	Player maggie;
	Platform Pwall1a, Pwall3a;
	Platform Plaser1a, Plaser1b, Plaser3a;
	Platform Pfloor1a, Pfloor1b, Pfloor1c, Pfloor1d;
	Platform Pfloor2a, Pfloor2b, Pfloor2c;
	Platform Pfloor4a;
	Platform Pfloor6a, Pfloor6b;
	Platform Pfloor8a;
	Platform Pbackground;
	Image maggieStand;
	Image emilyStand;
	Image wall1a, wall3a;
	Image floor1a, floor1b, floor1c, floor1d;
	Image floor2a, floor2b, floor2c;
	Image floor4a;
	Image floor6a, floor6b;
	Image floor8a;
	Image laser1a, laser1b, laser3a;
	Image background;
	Image button, leverL, leverR;
	public void init()
	{
		setContentPane(new DrawingPanel());
		time = new Timer(10, this);

		emilyStand = getImage(getDocumentBase(), "maggieStand.png");
		emily = new Player(50, 40, 90, 80, emilyStand, "Emily");
		maggieStand = getImage(getDocumentBase(), "maggieStand.png");
		maggie = new Player(900, 400, 90, 80, maggieStand, "Maggie");
		background = getImage(getDocumentBase(), "Background.png");
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
		wall1a = getImage(getDocumentBase(), "brickwall1.png");
		wall3a = getImage(getDocumentBase(), "brickwall3.png");
		laser1a = getImage(getDocumentBase(), "laserwall1.png");
		laser1b = getImage(getDocumentBase(), "laserwall1.png");
		laser3a = getImage(getDocumentBase(), "laserwall3.png");
		Pbackground = new Platform(0, 0, background, this);
		Pfloor1a = new Platform(150, 220, floor1a, this);
		Pfloor1b = new Platform(900, 220, floor1b, this);
		Pfloor1c = new Platform(0, 340, floor1c, this);
		Pfloor1d = new Platform(1050, 340, floor1d, this);
		Pfloor2a = new Platform(0, 580, floor2a, this);
		Pfloor2b = new Platform(450, 580, floor2b, this);
		Pfloor2c = new Platform(900, 580, floor2c, this);
		Pfloor4a = new Platform(300, 100, floor4a, this);
		Pfloor6a = new Platform(150, 460, floor6a, this);
		Pfloor6b = new Platform(150, 700, floor6b, this);
		Pfloor8a = new Platform(0, 820, floor8a, this);
		Pwall1a = new Platform(590, 0, wall1a,this);
		Pwall3a = new Platform(590, 480, wall3a,this);
		Plaser1a = new Platform(150, 480, laser1a, this);
		Plaser1b = new Platform(1030, 480, laser1b, this);
		Plaser3a = new Platform(590, 120, laser3a, this);

		addKeyListener(this);
		setFocusable(true);
	}//end init
	public class DrawingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			maggie.draw(g);
			Pbackground.draw(g);
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
			Pwall1a.draw(g);
			Pwall3a.draw(g);
			Plaser1a.draw(g);
			Plaser1b.draw(g);
			Plaser3a.draw(g);
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
