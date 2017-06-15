import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Platform
{
	Player player;
	int x, y, width, height;
	String type;
	public Platform(int xIn, int yIn, int widthIn, int heightIn)
	{
		x = xIn;
		y = yIn;
		width = widthIn;
		height = heightIn;
	}//end constructor
	public void draw(Graphics g)
	{
		g.fillRect(x, y, width, height);
	}//end draw
	public void floor(Player playerImport)
	{
		player = playerImport;
		if (player.getX() + player.getWidth() > x && player.getX() < x + width)
		{
			if (player.getY() + player.getHeight() >= y && player.getY() + player.getHeight() <= y + height)
			{
				player.stopDown();
				player.moveUp(((player.getY() + player.getHeight()) - y));
			}//end if
		}
		else
		{
			player.fall();
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
	public void lasergone()
	{
		x = 2000;
		y = 2000;
	}
}//end CL
