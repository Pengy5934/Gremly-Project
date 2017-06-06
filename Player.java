import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Toolkit;


public class Player implements ActionListener
{
	int x, y, width, height, velox, veloy, speed, gameTimer = 0;
	int frame = 1, frameHolder;
	String pictureName, playerName = "";
	boolean canMoveUp = true, canMoveDown = false, canMoveLeft = true, canMoveRight = true, animateUp = false, animateDown = false, animateLeft = false, animateRight = false;
	Image playerStand;
	Timer time;
	Toolkit tk;
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
		if (canMoveUp == true && canMoveDown == false && animateRight == false && animateLeft == false)
		{
			g.drawImage(playerStand, x, y, null);
		}//end if
		if (canMoveUp == true && canMoveDown == false && animateRight == true && animateLeft == false)
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
				g.drawImage(tk.getImage((playerName + "Right" + frameHolder + ".png")), x, y, null);
			}//end if
			if (frame > 9)
			{
				frame = 1;
			}//end if
			frameHolder = frame;
		}//end if
	}//end draw
	public void actionPerformed(ActionEvent e)
	{

	}//end action performed
	public void walkLeft()
	{
		if (canMoveLeft)
		{
			x -= 1;
			animateLeft = true;
			animateRight = false;
		}//end if
	}//end run Left
	public void walkRight()
	{
		if (canMoveRight)
		{
			x += 2;
			animateRight = true;
			animateLeft = false;
		}//end if
	}//end walk right
	public void jump()
	{
		if (canMoveUp)
		{
			y -= 2;
		}//end if
	}//end jump
	public void fall()
	{
		if (canMoveDown)
		{
			y += 2;
		}//end if
	}//end fall
	public void stopDown()
	{
		canMoveDown = false;
	}//end stop down
	public void stopUp()
	{
		canMoveUp = false;
	}//end stop up
	public void stopLeft()
	{
		canMoveLeft = false;
	}//end stop left
	public void stopRight()
	{
		canMoveRight = false;
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
	public void thrust()
	{
	}//end thrust
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

