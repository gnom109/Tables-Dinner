/*
 * Logan Pulley
 * Jordain Sharma
 * v0.2 Alpha
 */
import java.util.*;
public class Dinner
{
	public static void main(String[] args)
	{
		Scanner steve = new Scanner(System.in);
		List<Table> tables = new ArrayList<Table>(); // Contains all tables
		int numSeniors, numUnder; // Number of seniors, number of non-seniors
		
		System.out.print("How many seniors? "); // Gets numSeniors
		numSeniors = steve.nextInt();
		System.out.print("How many other students? "); // Gets numUnder
		numUnder = steve.nextInt();
		
		System.out.println("Creating " + numSeniors + " senior tables");
		for (int i = 0; i < numSeniors; i++) // Creates a table for each senior
		{
			tables.add(new Table(true));
		}
		
		if (numUnder / 7 > tables.size())
		{
			System.out.println("Adding " + (numUnder / 7 - tables.size()) + " overflow tables");
			for (int i = 0; i < (numUnder / 7) - tables.size(); i++) // Creates more tables as needed for non-seniors
			{
				tables.add(new Table(false));
			}
		}
		
		
	}
}
