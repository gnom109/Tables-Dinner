/*
 * Logan Pulley
 * Jordain Sharma
 * v0.2 Alpha
 */
public class Table
{
	private boolean hasSenior;
	private int numSeated;
	private int openSeats;
	private int[] seated = new int[] {-1, -1, -1, -1, -1, -1, -1, -1};
	
	public Table(boolean senior)//Table constructor
	{
		hasSenior = senior;
		if (hasSenior)
		{
			numSeated = 1;
			seated[0] = 0;
		}
		else numSeated = 0;
	}
	
	public boolean getHasSenior()//Returns hasSenior
	{
		return hasSenior;
	}
	
	public int getNumSeated()//Returns numSeated
	{
		return numSeated;
	}
	public int getOpenSeats()//Returns openSeats
	{
		for(int i = 0; i<seated.length;i++)
		{
			if(seated[i] == -1)
			{
				openSeats++;
			}
		}
		return openSeats;	
	}
	
	public boolean isSeniorAtTable()//Checks if a senior is present at a table
	{
		for(int i = 0; i<seated.length;i++)
		{
			if(seated[i] == 0)
			{
				return true;
			}
		}
		return false;	
	}
	
	
}
