import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Button
{
	int butX, butY;
	Image i;
	String type;
	FinalDriver fd;
	public Button(int xIn, int yIn, Image I, FinalDriver fd)
	{
		butX = xIn;
		butY = yIn;
		i = I;
		this.fd = fd;
	}
	public void draw(Graphics g)
	{
		g.drawImage( i, butX, butY, null);
	}
	public void pressed(Player player, Laser laser)
	{
		if (player.getX() + player.getWidth() > butX && player.getX() < butX + i.getWidth(fd))
		{
			if (player.getY() + player.getHeight() >= butY && player.getY() + player.getHeight() <= butY + i.getHeight(fd))
			{
				laser.lasergone();
			}//end if
		}
	}
}
