/*
 * Logan Pulley
 * Jordain Sharma
 * v0.2 Alpha
 */
public class Table
{
	private boolean hasSenior;
	private int numSeated;
	private int[] seated = new int[] {-1, -1, -1, -1, -1, -1, -1, -1};
	
	public Table(boolean senior)
	{
		hasSenior = senior;
		if (hasSenior)
		{
			numSeated = 1;
			seated[0] = 0;
		}
		else numSeated = 0;
	}
	
	public boolean getHasSenior()
	{
		return hasSenior;
	}
	
	public int getNumSeated()
	{
		return numSeated;
	}
	
	
}
