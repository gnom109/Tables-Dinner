import java.awt.List;
import java.io.*;
import java.util.*;

/*
 * Logan Pulley
 * Jordain Sharma
 * v0.3 Alpha
 */
public class Table
{
	private int numSeated;
	private int openSeats;
	//private int[] seated = new int[] {-1, -1, -1, -1, -1, -1, -1, -1};
	private List<Person> seated = new  ArrayList<Person>();
	public Table()//Table constructor
	{

	}
	
	public int getNumSeated()//Returns numSeated
	{
		return numSeated;
	}
	public int getOpenSeats()//Returns openSeats
	{
		for(int i = 0; i<seated.size;i++)
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
	
	public void printTablesToText()
	{
		PrintStream print;
		try {
			print = new PrintStream(new FileOutputStream("output.txt"));
			System.setOut(print);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setOut(print);

		
	}
	
	
}
