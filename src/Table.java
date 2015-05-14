/*
 * Logan Pulley
 * Jordain Sharma
 * v0.2 Alpha
 */
public class Table
{
	private boolean hasSenior;
	private int seated;
	private int [] studentTable = new int[8];
	public Table(boolean senior)
	{
		hasSenior = senior;
		if (hasSenior) seated = 1; else seated = 0;
	}
	
	public boolean getHasSenior()
	{
		return hasSenior;
	}
	
	public int getSeated()
	{
		return seated;
	}
}
