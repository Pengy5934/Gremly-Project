import java.awt.*;


public class Player
{
	int x, y, width, height, velox, veloy, speed;
	boolean up = true, down = false, left = true, right = true, animateUp = false, animateDown = false, animateLeft = false, animateRight = false;
	Image playerStand;
	public Player(int xIn, int yIn, int widthIn, int heightIn, Image imgIn)
	{
		x = xIn;
		y = yIn;
		width = widthIn;
		height = heightIn;
		playerStand = imgIn;
	}//end constructor
	public void draw(Graphics g)
	{
		if (up == false && down == false && left == false && right == false)
		{
			g.drawImage(playerStand, x, y, null);
		}//end if
	}//end draw
	public void walkLeft()
	{
		if (left)
		{
			x -= 1;
			animateLeft = true;
			animateRight = false;
		}//end if
	}//end run Left
	public void walkRight()
	{
		if (right)
		{
			x += 1;
			animateRight = true;
			animateLeft = false;
		}//end if
	}//end walk right
	public void jump()
	{
		if (up)
		{
			y -= 2;
		}//end if
	}//end jump
	public void fall()
	{
		if (down)
		{
			y += 2;
		}//end if
	}//end fall
	public void stopDown()
	{
		down = false;
	}//end stop down
	public void stopUp()
	{
		up = false;
	}//end stop up
	public void stopLeft()
	{
		left = false;
	}//end stop left
	public void stopRight()
	{
		right = false;
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
