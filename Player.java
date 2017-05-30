import java.awt.*;

public class Player
{
	int x, y;
	Image[] img = new Image[9];
	public Player(int xIn, int yIn, Image[] imgIn)
	{
		x = xIn;
		y = yIn;
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
}//end class
