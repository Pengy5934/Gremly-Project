import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Lever
{
	int levX, levY;
	Image i;
	String type;
	FinalDriver fd;
	public Lever(int xIn, int yIn, Image I, FinalDriver fd)
	{
		levX = xIn;
		levY = yIn;
		i = I;
		this.fd = fd;
	}
	public void draw(Graphics g)
	{
		g.drawImage( i, levX, levY, null);
	}
	public void flipped(Player player, Laser laser)
	{
		if (player.getX() + player.getWidth() > levX && player.getX() < levX + i.getWidth(fd))
		{
			if (player.getY() + player.getHeight() >= levY && player.getY() + player.getHeight() <= levY + i.getHeight(fd))
			{
				laser.lasergone();
			}//end if
		}
	}
}
