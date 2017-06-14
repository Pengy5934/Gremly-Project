
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FinalDriver extends JApplet implements ActionListener, KeyListener
{
	Timer time;
	Player emily;
	Player maggie;
	Platform Pwall1a, Pwall3a;
	Laser Plaser1a, Plaser1b, Plaser3a;
	Platform Pfloor1a, Pfloor1b, Pfloor1c, Pfloor1d;
	Platform Pfloor2a, Pfloor2b, Pfloor2c;
	Platform Pfloor4a;
	Platform Pfloor6a, Pfloor6b;
	Platform Pfloor8a;
	Button Pbutton1, Pbutton2;
	Lever Plever1, Plever2;
	Platform PdoorE, PdoorM;
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
	Image doorE, doorM;

	int timerTick = 0;
	boolean jumping = false;
	Container c;
	public void init()
	{
		setContentPane(new DrawingPanel());
		time = new Timer(10, this);
		time.isRunning();
		emilyStand = getImage(getDocumentBase(), "maggieStand.png");
		emily = new Player(660, 735, 90, 80, emilyStand, "Emily");
		maggieStand = getImage(getDocumentBase(), "maggieStand.png");
		maggie = new Player(450, 735, 90, 80, maggieStand, "Maggie");
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
		button = getImage(getDocumentBase(), "button.png");
		leverL = getImage(getDocumentBase(), "leverleft.png");
		leverR = getImage(getDocumentBase(), "leverright.png");
		doorE = getImage(getDocumentBase(), "doorE.png");
		doorM = getImage(getDocumentBase(), "doorM.png");
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
		Plaser1a = new Laser(150, 480, laser1a, this);
		Plaser1b = new Laser(1030, 480, laser1b, this);
		Plaser3a = new Laser(590, 120, laser3a, this);
		Pbutton1 = new Button(400, 450, button, this);
		Pbutton2 = new Button(700, 450, button, this);
		Plever1 = new Lever(450, 530, leverL, this);
		Plever2 = new Lever(650, 530, leverR, this);
		PdoorE = new Platform(450, 0, doorE, this);
		PdoorM = new Platform(700, 0, doorM, this);

		addKeyListener(this);
		setFocusable(true);
	}//end init
	public class DrawingPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);

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
			Pbutton1.draw(g);
			Pbutton2.draw(g);
			Plever1.draw(g);
			Plever2.draw(g);
			PdoorE.draw(g);
			PdoorM.draw(g);
			//if (time.isRunning())
			//{
			maggie.draw(g);
			emily.draw(g);
			//}
		}//end paint component
	}//end drawing panel
	public void actionPerformed(ActionEvent e)
	{
		//if (time.isRunning())
		//{
			Pfloor1a.floor(emily);
			Pfloor1b.floor(emily);
			Pfloor1c.floor(emily);
			Pfloor1d.floor(emily);
			Pfloor2a.floor(emily);
			Pfloor2b.floor(emily);
			Pfloor2c.floor(emily);
			Pfloor4a.floor(emily);
			Pfloor6a.floor(emily);
			Pfloor6b.floor(emily);
			Pfloor8a.floor(emily);
			Pfloor1a.ceiling(emily);
			Pfloor1b.ceiling(emily);
			Pfloor1c.ceiling(emily);
			Pfloor1d.ceiling(emily);
			Pfloor2a.ceiling(emily);
			Pfloor2b.ceiling(emily);
			Pfloor2c.ceiling(emily);
			Pfloor4a.ceiling(emily);
			Pfloor6a.ceiling(emily);
			Pfloor6b.ceiling(emily);
			Pfloor8a.ceiling(emily);
			Pwall1a.wall(emily);
			Pwall3a.wall(emily);
			Pfloor1a.floor(maggie);
			Pfloor1b.floor(maggie);
			Pfloor1c.floor(maggie);
			Pfloor1d.floor(maggie);
			Pfloor2a.floor(maggie);
			Pfloor2b.floor(maggie);
			Pfloor2c.floor(maggie);
			Pfloor4a.floor(maggie);
			Pfloor6a.floor(maggie);
			Pfloor6b.floor(maggie);
			Pfloor8a.floor(maggie);
			Pfloor1a.ceiling(maggie);
			Pfloor1b.ceiling(maggie);
			Pfloor1c.ceiling(maggie);
			Pfloor1d.ceiling(maggie);
			Pfloor2a.ceiling(maggie);
			Pfloor2b.ceiling(maggie);
			Pfloor2c.ceiling(maggie);
			Pfloor4a.ceiling(maggie);
			Pfloor6a.ceiling(maggie);
			Pfloor6b.ceiling(maggie);
			Pfloor8a.ceiling(maggie);
			Pwall1a.wall(maggie);
			Pwall3a.wall(maggie);
			Plever2.flipped(emily, Plaser1a);
			Plever1.flipped(maggie, Plaser1b);
			Pbutton1.pressed(maggie, Plaser3a);
			Pbutton1.pressed(emily, Plaser3a);
			Pbutton2.pressed(maggie, Plaser3a);
			Pbutton2.pressed(emily, Plaser3a);
		//}
		repaint();
	}//end action performed
	public void keyTyped(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			maggie.jump();
			jumping = true;
			repaint();
		}//end if
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
	}//end key pressed
	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			maggie.stopRight();
			//maggie.stand();
			repaint();
		}//end if
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			maggie.stopLeft();
			//maggie.stand();
			repaint();
		}//end if
	}//end key released
}//end public class
