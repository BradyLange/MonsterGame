package sprites;

// Import libraries 
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import mvc.GraphicsUpdater;

/**
 * Sprite is a class defining the data of a 
 * character in the game.
 * <p>
 *		Sprite implements {@link GraphicsUpdater}, which 
 * 		means a Sprite object can draw itself to a {@link Graphics} object.
 * <p>
 *
 * @author Brady Lange
 * @version 1.0.1
 * @since 1.0
 * @date 11/06/2018
 */

public abstract class Sprite implements GraphicsUpdater
{
	// Instance variables
	protected Image image;
	protected int x;
	protected int y;
	protected int dest_x;
	protected int dest_y;
	protected int size;
	protected int speed = 10;

	/**
	 * A Sprite constructor. 
	 *
	 * @param x
	 *            x-coordinate of a Sprite object.
	 * @param y
	 *            y-coordinate of a Sprite object.
	 * @param size
	 *            size of a Sprite object.
	 * @param speed
	 *            speed of a Sprite object.
	 * @param imagePath
	 *            path to an image file.
	 */
	Sprite(int x, int y, int size, int speed, String imagePath)
	{
		try 
		{
	    	image = ImageIO.read(new File(imagePath));
	    } catch (IOException ioe) {
	    	System.out.println("Unable to load image file.");
	    }
		setPos(x,y);
		setDest(x,y);
		setSize(size);
		setSpeed(speed);
	}	

	/**
	 * Implementation of {@link GraphicsUpdater#update}. 
	 *
	 * @param g
	 *         The {@link Graphics} object to be modified.
	 */
	@Override
    public void update(Graphics g) 
	{
		g.drawImage(image, x, y, size, size, null);
	}
	
	/**
	 * A method that uses a Sprite object's current 
	 * position, destination, and speed to calculate 
	 * a new (x, y) position for the Sprite object.
	 * <p>
	 * This method modifies the x and y fields of a Sprite object. 
	 *
	 */
	public abstract void updatePosition();
         	
    // Misc. setters and getters
	public Image getImage() { return image; }
    public int getX() { return x; }
    public int getY() { return y; }

    public void setDest(int x, int y) 
    {
		dest_x = x - getSize()/2;
    	dest_y = y - getSize()/2;
	}
    
    public void setPos(int x, int y) 
    {
		this.x = x - getSize()/2;
		this.y = y - getSize()/2;
	}
    
	public int getSize() {	return size; }
	public void setSize(int size)   { this.size = size;   }
	public void setSpeed(int speed)   { this.speed = speed;   }	
}
