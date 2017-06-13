
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Laser
{

	int platX, platY;
	Image i;
	String type;
	FinalDriver fd;
	boolean gone = false;
	public Laser(int xIn, int yIn, Image I, FinalDriver fd)
	{
		platX = xIn;
		platY = yIn;
		this.fd = fd;

	}//end constructor
	public void draw(Graphics g)
	{
		if (! gone)
		{
			g.drawImage(i, platX, platY, null);
		}//end if
	}//end draw
	public void button(Player player, Platform platform)
	{
		if (player.getX() + player.getWidth() > platX && player.getX() < platX + i.getWidth(fd))
		{
			if (player.getY() + player.getHeight() >= platY && player.getY() + player.getHeight() <= platY + i.getHeight(fd))
			{
			gone = true;
			platform.lasergone();
			}//end if
		}//end if
		else
		{
			gone = false;
		}//end else
	}//end button
	public void lever(Player player, Platform platform)
	{
		if (player.getX() + player.getWidth() > platX && player.getX() < platX + i.getWidth(fd))
		{
			if (player.getY() + player.getHeight() >= platY && player.getY() + player.getHeight() <= platY + i.getHeight(fd))
			{
			gone = true;
			platform.lasergone();
			}//end if
		}//end if
	}//end lever
	public void door(Player player, Platform platform)
	{
				if (player.getX() + player.getWidth() > platX && player.getX() < platX + i.getWidth(fd))
				{
					if (player.getY() + player.getHeight() >= platY && player.getY() + player.getHeight() <= platY + i.getHeight(fd))
					{
					gone = true;
					}//end if
		}//end if
	}
}