/*
 * Logan Pulley
 * Jordain Sharma
 */
public class Table
{
	private boolean hasSenior;
	private int seated;
	
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
