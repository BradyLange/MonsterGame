package sprite_decorations;

import java.awt.Graphics;
import java.awt.Image;

import sprites.Sprite;

public class SpriteDecorator extends Sprite
{
	protected final Sprite decoratedSprite;
	protected Image image;

	public SpriteDecorator(Sprite sprite, String imagePath) 
	{
		super(x, y, size, speed, imagePath);
		// TODO Auto-generated constructor stub
	}
	
	@Override 
	public void update(Graphics g)
	{
		decoratedSprite.update(g);
	}

}
