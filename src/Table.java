/*
 * Logan Pulley
 * Jordain Sharma
 * v0.3 Alpha
 */
public class Table
{
	private int numSeated;
	private int openSeats;
	private int[] seated = new int[] {-1, -1, -1, -1, -1, -1, -1, -1};
	
	public Table(boolean senior)//Table constructor
	{
		if (senior)
		{
			seated[0] = 0;
		}
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
		if (seated[0] == 0) return true; else return false;
	}
	
	
}
