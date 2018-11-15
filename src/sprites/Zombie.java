package sprites;

// Import libraries
import java.awt.Graphics;

import mvc.Settings;
import navigation.Pair;

/**
 * Zombie is a class defining the data of a 
 * character in the game - a Zombie in particular.
 * <p>
 * 		Zombie extends {@link Sprite}, which 
 * 		means a Zombie object receives properties from a {@link Sprite} object
 * 		and can draw itself to a {@link Graphics} object.
 * <p>
 *
 * @author Brady Lange
 * @version 1.0.1
 * @since 1.0
 * @date 11/06/2018
 */

public class Zombie extends Sprite
{	
	/**
	 * A Zombie constructor. 
	 *
	 * @param x
	 *            x-coordinate of a Zombie object.
	 * @param y
	 *            y-coordinate of a Zombie object.
	 * @param size
	 *            size of a Zombie object.
	 * @param speed
	 *            speed of a Zombie object.
	 * @param imagePath
	 *            path to an image file.
	 */
	public Zombie(int x, int y)
	{
		super(x, y, Settings.ZOMBIE_SIZE, Settings.ZOMBIE_SPEED, Settings.ZOMBIE_IMAGE);
	}	
}