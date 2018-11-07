package sprites;

// Import libraries
import java.awt.Graphics;
import mvc.Settings;

/**
 * Werewolf is a class defining the data of a 
 * character in the game - a Werewolf in particular.
 * <p>
 * 		Werewolf extends {@link Sprite}, which 
 * 		means a Werewolf object receives properties from a {@link Sprite} object
 * 		and can draw itself to a {@link Graphics} object.
 * <p>
 *
 * @author Brady Lange
 * @version 1.0.1
 * @since 1.0
 * @date 11/06/2018
 */

public class Werewolf extends Sprite
{
	/**
	 * A Werewolf constructor. 
	 *
	 * @param x
	 *            x-coordinate of a Werewolf object.
	 * @param y
	 *            y-coordinate of a Werewolf object.
	 * @param size
	 *            size of a Werewolf object.
	 * @param speed
	 *            speed of a Werewolf object.
	 * @param imagePath
	 *            path to an image file.
	 */
	public Werewolf(int x, int y)
	{
		super(x, y, Settings.WEREWOLF_SIZE, Settings.WEREWOLF_SPEED, Settings.WEREWOLF_IMAGE);
	}	
	
	/**
	 * A method that uses a Werewolf object's current 
	 * position, destination, and speed to calculate 
	 * a new (x, y) position for the Werewolf object.
	 * <p>
	 * This method modifies the x and y fields of a Werewolf object. 
	 *
	 */
	@Override
	public void updatePosition() 
	{
    	if (x < dest_x) 
    	{
    		int min = dest_x - x < speed ? dest_x - x : speed; 
    		x += min;
    	} 
    	else if (x > dest_x) 
    	{
    		int min = x - dest_x < speed ? x - dest_x : speed; 
    		x -= min;
    	}
    	        
    	if (y < dest_y) 
    	{
    		int min = dest_y - y < speed ? dest_y - y : speed; 
    		y += min;
    	} 
    	else if (y > dest_y) 
    	{
    		int min = y - dest_y < speed ? y - dest_y : speed; 
    		y -= min;
    	}
	}
}
