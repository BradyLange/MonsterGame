package sprite_decorations;

import java.awt.Graphics;

import mvc.Settings;
import sprites.Sprite;

public class CheeseHatDecoration extends SpriteDecorator
{
	private int sizeOffSet;
	private int xOffSet;
	private int yOffSet;
	
	public CheeseHatDecoration(Sprite sprite, int xOffSet, int yOffSet, int sizeOffSet)
	{
		super(sprite, Settings.CHEESE_HAT_IMAGE);
		this.sizeOffSet = sizeOffSet;
		this.xOffSet = xOffSet;
		this.yOffSet = yOffSet;
	}
	@Override
	public void update(Graphics g)
	{
		super.update(g);
		
		// Position hat
		int hatSize = decoratedSprite.getSize() + sizeOffSet;
		int hatX = decoratedSprite.getX() + xOffSet;
		int hatY = decoratedSprite.getY() + yOffSet;
		
		g.drawImage(image, hatX, hatY, hatSize, hatSize, null);
	}
}
