package sprites;

// Import libraries 
import java.awt.Graphics;
import mvc.Settings;

/**
 * Human is a class defining the data of a 
 * character in the game - a Human in particular.
 * <p>
 * 		Human extends {@link Sprite}, which 
 * 		means a Human object receives properties from a {@link Sprite} object
 * 		and can draw itself to a {@link Graphics} object.
 * <p>
 *
 * @author Brady Lange
 * @version 1.0.1
 * @since 1.0
 * @date 11/06/2018
 */

public class Human extends Sprite
{
	/**
	 * A Human constructor. 
	 *
	 * @param x
	 *            x-coordinate of a Human object.
	 * @param y
	 *            y-coordinate of a Human object.
	 * @param size
	 *            size of a Human object.
	 * @param speed
	 *            speed of a Human object.
	 * @param imagePath
	 *            path to an image file.
	 */
	public Human(int x, int y)
	{
		super(x, y, Settings.HUMAN_SIZE, Settings.HUMAN_SPEED, Settings.HUMAN_IMAGE);
	}	
}
