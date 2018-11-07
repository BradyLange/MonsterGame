package mvc;

// Import libraries
import java.awt.Graphics;

/**
 * A GraphicsUpdater can update a {@link Graphics} object.
 * In other words, you can give a GraphicsUpdater a Graphics object
 * and it will "draw" something to the Graphics object. 
 * 
 * @author Brady Lange
 * @version 1.0.1
 * @since 1.0
 * @date 11/06/2018
 */
public interface GraphicsUpdater 
{
	/**
	 * A method that can update a {@link Graphics} object.
	 */
	// Method to update the graphics 
	public void update(Graphics g);
}
