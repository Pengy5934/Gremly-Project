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
		i = I;
		this.fd = fd;

	}//end constructor
	public void draw(Graphics g)
	{
		//if (gone == false)
		//{
		g.drawImage(i, platX, platY, null);
		//}//end if
	}//end draw
	public void lasergone()
	{
		gone = true;
		platX = 2000;
		platY = 2000;
	}
}
