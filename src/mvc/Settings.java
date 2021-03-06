package mvc;

/**
 * A class that holds static final variables.
 * Note that this class cannot be instantiated
 * as the constructor is private. So, Settings is 
 * basically a bag of constants.
 * 
 * @author Brady Lange
 * @version 1.0.1
 * @since 1.0
 * @date 11/06/2018
 */

public final class Settings 
{
	// Settings Default Constructor
	private Settings() 
	{
		
	}
	
	// Application size 
	public static final int WIDTH               = 1920;
	public static final int HEIGHT              = 1080;
	
	// Zombie attributes 
	public static final int ZOMBIE_SIZE         = 200;
	public static final int ZOMBIE_SPEED        = 1;
	public static final String ZOMBIE_IMAGE     = "Images/zombie.png";
	
	// Werewolf attributes
	public static final int WEREWOLF_SIZE       = 200;
	public static final int WEREWOLF_SPEED      = 2;
	public static final String WEREWOLF_IMAGE   = "Images/werewolf.png";
	
	// Human attributes 
	public static final int HUMAN_SIZE          = 200;
	public static final int HUMAN_SPEED 		= 10;
	public static final String HUMAN_IMAGE 		= "Images/human.png";
	
	// Decorations
	public static final String CHEESE_HAT_IMAGE = "Images/Decorations/cheese_hat.png";
	public static final String VIKING_HAT_IMAGE = "Images/Decorations/viking_hat.png";
}
