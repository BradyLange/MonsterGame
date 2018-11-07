package mvc;

// Import libraries
import java.awt.Graphics;
import java.util.List;

import sprites.Human;
import sprites.Sprite;

/**
 * Model is the class 
 * that manages all data about 
 * game characters.
 * <p>
 * This class implements GraphicsUpdater, which means that
 * it can be used to update a frame of animation.
 * <p>
 * Depends on:
 * <ul>
 * 		<li>{@link Sprite}
 * </ul>
 * 
 * @author Brady Lange
 * @version 1.0.1
 * @since 1.0
 * @date 11/06/2018
 */
public class Model implements GraphicsUpdater 
{	
	// Instance variables
	private List<Sprite> sprites;
	private Sprite player;
	
	/**
	 * A Model constructor that creates a collection of sprite objects.
	 *
	 */
	public Model(List<Sprite> sprites)
	{
		System.out.println("Model()");
		this.sprites = sprites;
	} 	

	/**
	 * A method that updates the {@link Graphics} object
	 * used by the view. The {@link Sprite} positions are also 
	 * updated when this method is called.
	 * 
 	 * @param g
	 *            A {@link Graphics} object reference. The model
	 *            can update a {@link Graphics} object with {@link Sprite} data.
	 */
	@Override
	public void update(Graphics g) 
	{
		for (Sprite sprite : sprites) 
		{
			sprite.updatePosition();
			sprite.update(g);
		}
	}
	
	/**
	 * A method for setting the (x, y) coordinates of a the characters 
	 * managed by the Model.
	 * 
 	 * @param x
	 *            the x-coordinate
	 * @param y
	 *            the y-coordinate
	 */
	public void setSpriteDestinations(int x, int y)
	{
		if (player == null)
		{
			player = new Human(x, y);
		}
		for (Sprite sprite : sprites)
		{
			sprite.setDest(x, y);
		}
	}
}