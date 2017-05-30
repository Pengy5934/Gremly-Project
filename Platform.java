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
	}//end thrust
}//end attack