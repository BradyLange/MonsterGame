package application;

// Import libraries
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Timer;

import mvc.Controller;
import mvc.Model;
import mvc.Settings;
import mvc.View;
import sprites.Human;
import sprites.Sprite;
import sprites.Werewolf;
import sprites.Zombie;

/**
 * Driver is the class that contains the main method.
 * 
 * This class "glues" other classes together. 
 * <p>
 * Depends on:
 * <ul>
 * 		<li>{@link Model}
 * 		<li>{@link View}
 * 		<li>{@link Controller}
 * </ul>
 * 
 * @author Brady Lange
 * @version 1.0.1
 * @since 1.0
 * @date 11/06/2018
 */
public class Driver 
{
	/**
	 * The main method instantiates 
	 * and sets up 
	 * a {@link Model}, {@link View}, and {@link Controller}.
	 * <p>
	 * A {@link javax.swing.Timer} is instantiated and started to drive the animation.
	 * Note that the {@link Controller} implements {@link java.awt.event.ActionListener}. 
	 * This means that {@link Controller} implements 
	 * {@link Controller#actionPerformed(java.awt.event.ActionEvent)}, 
	 * a method that is called when the timer goes off.
	 *
	 * @param args
	 *            command line arguments that we do not use
	 */
	public static void main(String [] args) 
	{
		// Use random numbers for sprites x & y coordinates 
		Random r = new Random();
		int x = r.nextInt(Settings.WIDTH);
		int y = r.nextInt(Settings.HEIGHT);
		
		// Create sprites 
		Zombie zombie = new Zombie(x, y);
		Werewolf werewolf = new Werewolf(x, y);
		Human human = new Human(x, y);
		
		// Add sprites to a collection
		ArrayList<Sprite> sprites = new ArrayList<Sprite>();
		sprites.add(zombie);
		sprites.add(werewolf);
		sprites.add(human);
		
		Model model = new Model(sprites);
		Controller controller = new Controller();
		View view = new View(controller, model);
		
		// Give the controller a reference to the view and model
		controller.addModel(model);
		controller.addView(view);

		// Start animation using a swing timer
		new Timer(10, controller).start();
	}
}
