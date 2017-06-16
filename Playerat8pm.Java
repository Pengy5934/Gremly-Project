import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Toolkit;


public class Player implements ActionListener
{
	int x, y, width, height, velox, veloy, speed, gameTimer = 0;
	int frame = 1, frameHolder, veloX = 0, veloY = 0, jumpCount = 0;
	String pictureName, playerName = "";
	boolean canMoveUp = true, canMoveDown = true, canMoveLeft = true, canMoveRight = true, canFall = true;
	Image playerStand;
	Timer time;
	Toolkit tk;
	FinalDriver fd = new FinalDriver();
	public Player(int xIn, int yIn, int widthIn, int heightIn, Image imgIn, String name)
	{
		x = xIn;
		y = yIn;
		width = widthIn;
		height = heightIn;
		playerStand = imgIn;
		playerName = name;
		time = new Timer(10, this);
		tk = Toolkit.getDefaultToolkit();
	}//end constructor
	public void draw(Graphics g)
	{
		x += veloX;
		y += veloY;
		if (veloX == 0 && veloY == 0)
		{
			g.drawImage(playerStand, x, y, null);
		}//end if
		if (veloX > 0 && veloY == 0)
		{
			String pictureName = playerName + "Right" + frame + ".png";
			frame += 1;
			gameTimer++;
			if (gameTimer % 2 == 0)
			{
				g.drawImage(tk.getImage(pictureName), x, y, null);
			}
			else
			{
				g.drawImage(tk.getImage(playerName + "Right" + frameHolder + ".png"), x, y, null);
			}//end if
			if (frame > 8)
			{
				frame = 1;
			}//end if
			frameHolder = frame;
		}//end walk right animation
		if (veloX < 0 && veloY == 0)
		{
			String pictureName = playerName + "Left" + frame + ".png";
			frame += 1;
			gameTimer++;
			if (gameTimer % 2 == 0)
			{
				g.drawImage(tk.getImage(pictureName), x, y, null);
			}
			else
			{
				g.drawImage(tk.getImage(playerName + "Left" + frameHolder + ".png"), x, y, null);
			}//end if
			if (frame > 8)
			{
				frame = 2;
			}//end if
			frameHolder = frame;
		}//end left walking animation
		if (veloY < 0)
		{
			String pictureName = playerName + "Jump5.png";
			g.drawImage(tk.getImage(pictureName), x, y, null);
			veloY++;
			if (veloY == 0)
				veloY += 2;
		}//end fall animation
		if (veloY > 0)
		{
			String pictureName = playerName + "Jump5.png";
			g.drawImage(tk.getImage(pictureName), x, y, null);
			veloY++;
		}//end if
	}//end draw
	public void actionPerformed(ActionEvent e)
	{

	}//end action performed
	public void walkLeft()
	{
		if (canMoveLeft)
		{
			veloX = -10;
		}//end if
	}//end run Left
	public void walkRight()
	{
		if (canMoveRight)
		{
			veloX = 10;
		}//end if
	}//end walk right
	public void jump()
	{
		if (canMoveUp)
		{
			veloY = -10;
		}//end if
	}//end jump
	public void fall()
	{
		if (canMoveDown)
		{
			veloY = 4;
		}//end if
	}//end fall
	public void notColliding()
	{
		canMoveDown = true;
	}
	public void canJump()
	{
		canMoveUp = true;
	}
	public void stopDown()
	{
		veloY = 0;
		canMoveDown = false;
	}//end stop down
	public void stopUp()
	{
		veloY = 0;
	}//end stop up
	public void stopLeft()
	{
		veloX = 0;
	}//end stop left
	public void stopRight()
	{
		veloX = 0;
	}//end stop right
	public void moveUp(int m)
	{
		y -= m;
	}//end move up
	public void moveDown(int m)
	{
		y += m;
	}//end move down
	public void moveRight(int m)
	{
		x += m;
	}//end move right
	public void moveLeft(int m)
	{
		x -= m;
	}//end move left
	public int getX()
	{
		return x;
	}//end get x
	public int getY()
	{
		return y;
	}//end get y
	public int getWidth()
	{
		return width;
	}//end get width
	public int getHeight()
	{
		return height;
	}//end get height
}//end class
