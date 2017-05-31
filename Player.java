import java.awt.*;

public class Player
{
	int x, y, width, height, velox, veloy, speed;
	boolean up = true, down = false, left = true, right = true;
	Image[] img = new Image[9];
	public Player(int xIn, int yIn, int widthIn, int heightIn, Image[] imgIn)
	{
		x = xIn;
		y = yIn;
		width = widthIn;
		height = heightIn;
		for (int i = 0; i < imgIn.length; i++)
		{
			img[i] = imgIn[i];
		}//end for loop
	}//end constructor
	public void draw(Graphics g)
	{
	}//end draw
	public void walkLeft()
	{
	}//end run Left
	public void walkRight()
	{
	}//end walk right
	public void jump()
	{
	}//end jump
	public void fall()
	{
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
