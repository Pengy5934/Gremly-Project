import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Platform
{
	Player player;
	int platX, platY;
	Image i;
	String type;
	FinalDriver fd;
	public Platform(int xIn, int yIn, Image I, FinalDriver fd)
	{
		platX = xIn;
		platY = yIn;
		i = I;
		//this.fd = fd;
	}//end constructor
	public void draw(Graphics g)
	{
		g.drawImage( i, platX, platY, null);
	}//end draw
	public void floor(Player playerImport)
	{
		player = playerImport;
		if (player.getX() + player.getWidth() > platX && player.getX() < platX + i.getWidth(fd))
		{
			if (player.getY() + player.getHeight() >= platY && player.getY() + player.getHeight() <= platY + i.getHeight(fd))
			{
				player.stopDown();
				player.moveUp(((player.getY() + player.getHeight()) - platY));
			}//end if
		}//end if
		else
		 {
			 player.notColliding();
			 player.fall();
		 }
	}//end floor
	public void wall(Player playerImport)
	{
		player = playerImport;
		if (player.getY() + player.getHeight() > platY && player.getY() < platY + i.getHeight(fd))
		{
			if (player.getX() <= platX + i.getWidth(fd) && player.getX() >= platX)
			{
				player.stopLeft();
				player.moveLeft((platX + i.getWidth(fd)) - player.getX());
				//player.stopRight();
				//player.moveRight((platX + i.getWidth(fd)) - player.getX());
			}//end if
		}//end if
	}//end wall
	public void ceiling(Player playerImport)
	{
		player = playerImport;
		if (player.getX() + player.getWidth() > platX && player.getX() < platX + i.getWidth(fd))
		{
			if (player.getY() < platY + 30 && player.getY() > platY + 30)
			{
				player.stopUp();
				System.out.println("ceiling");
				player.moveDown((platY + i.getHeight(fd)) - player.getY());

			}//end if
		}//end if
		else if (player.getX() + player.getWidth() < platX || player.getX() > platX + i.getWidth(fd))
		{
			player.canJump();
		}
	}//end ceiling
}//end CLass
