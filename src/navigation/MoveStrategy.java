package navigation;

public interface MoveStrategy 
{
	public Pair move(int x, int y, int dest_x, int dest_y, int speed);
}
