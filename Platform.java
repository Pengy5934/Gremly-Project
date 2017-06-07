import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Platform
{
	Player player;
	int x, y, height, width, level;
	String type;
	public Platform(int xIn, int yIn, int widthIn, int heightIn, int levelIn)
	{
		x = xIn;
		y = yIn;
		width = widthIn;
		height = heightIn;
		level = levelIn;
	}//end constructor
	public void draw(Graphics g)
	{
		g.fillRect(x, y, height, width);
	}//end draw
	public void floor(Player playerImport)
	{
		player = playerImport;
		if (player.getX() + player.getWidth() > x && player.getX() < x + width)
		{
			if (player.getY() + player.getHeight() >= y && player.getY() + player.getHeight() <= y + height)
			{
				player.stopDown();
				player.moveUp(-((player.getY() + player.getHeight()) - y));
			}//end if
		}//end if
	}//end floor
	public void wall(Player playerImport)
	{
		player = playerImport;
		if (player.getY() + player.getHeight() > y && player.getY() < y + height)
		{
			if (player.getX() <= x + width && player.getX() >= x)
			{
				player.stopLeft();
				player.moveLeft((x + width) + player.getX());
			}//end if
		}//end if
	}//end wall
	public void ceiling(Player playerImport)
	{
		player = playerImport;
		if (player.getX() + player.getWidth() > x && player.getX() < x + width)
		{
			if (player.getY() > y + height && player.getY() > y + height)
			{
				player.stopUp();
				player.moveDown((y + height) - player.getY());
			}//end if
		}//end if
	}//end ceiling
	public void level2()
	{
		if (level == 1)
		{
			x = 1000;
			y = 1000;
		}//end if
	}//end level 2
	public void level3()
	{
		if (level == 2)
		{
			x = 1000;
			y = 1000;
		}//end if
	}//end level 3
}//end platform
