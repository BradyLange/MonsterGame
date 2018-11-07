package mvc;

// Import libraries
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.event.MouseListener;

/**
 * View is the class
 * in charge of displaying the GUI.
 * 
 * <p>
 * Depends on:
 * <ul>
 * 		<li>{@link GraphicsUpdater}
 * 		<li>{@link MouseListener}
 * </ul>
 * 
 * View uses the controller to respond to 
 * mouse click events and timer events.
 * 
 * @author Brady Lange
 * @version 1.0.1
 * @since 1.0
 * @date 11/06/2018
 */
public class View 
{
	private JFrame frame;
	private GraphicsUpdater graphicsUpdater;
	private MouseListener mouseListener;

	// Define an inner class
	@SuppressWarnings("serial")
	private class MyPanel extends JPanel 
	{
		public void paintComponent(Graphics g) 
		{
			graphicsUpdater.update(g);
			revalidate();
		}
	}

	// Declare reference to inner class type
	private MyPanel panel;

	/**
	 * A View constructor. 
	 *
	 * @param controller
	 *            An {@link MouseListener} object.
	 * @param controller
	 *            An {@link GraphicsUpdater} object.
	 */
	public View(MouseListener mouseListener, GraphicsUpdater graphicsUpdater) 
	{
		System.out.println("View()");

		frame = new JFrame("MVC...BRAINS!!!");

		// Create a panel to contain sprites
		panel = new MyPanel();
		frame.add(panel);

		frame.setSize(Settings.WIDTH, Settings.HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		System.out.println("View      : adding controller");
		
		frame.getContentPane().addMouseListener(mouseListener);
		
		this.mouseListener = mouseListener;	
		this.graphicsUpdater = graphicsUpdater;
	}

	/**
	 * A method for refreshing the frame
	 * of animation. 
	 */
	public void refresh()
	{
		frame.repaint();
	}
}