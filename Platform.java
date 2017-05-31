import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Platform
{
	Player player;
	int x, y, height, width;
	String type;
	public Platform(int xIn, int yIn, int widthIn, int heightIn, Player playerImport)
	{
		x = xIn;
		y = yIn;
		width = widthIn;
		height = heightIn;
		player = playerImport;
	}//end constructor
	public void draw(Graphics g)
	{
		floor();
		g.fillRect(x, y, height, width);
	}//end draw
	public void floor()
	{
		//https://www.youtube.com/watch?v=UnU7DJXiMAQ
		if (player.getX() + player.getWidth() > x && player.getX() < x + width)
		{
			if (player.getY() + player.getHeight() >= y && player.getY() + player.getHeight() <= y + height)
			{
				player.stopDown();
				player.moveUp(-((player.getY() + player.getHeight()) - y));
			}//end if
		}//end if
	}//end thrust
	public void wall()
	{
		if (player.getY() + player.getHeight() > y && player.getY() < y + height)
		{
			if (player.getX() <= x + width && player.getX() >= x)
			{
				player.stopLeft();
				player.moveLeft((x + width)player.getX());
			}//end if
			if ()//above accounts for leftward motion, now do right
			{
			}//end if
		}//end if
	}//end wall
}//end attack
