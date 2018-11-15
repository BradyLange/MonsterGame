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
}
