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
		Table[] tables; // Contains all tables
		int numSeniors, numUnder; // Number of seniors, number of non-seniors
		int tablesNeeded = 0; // Number of tables needed to seat everyone
		
		System.out.print("How many seniors? "); // Gets numSeniors
		numSeniors = steve.nextInt();
		System.out.print("How many other students? "); // Gets numUnder
		numUnder = steve.nextInt();
		
		tablesNeeded += numSeniors; // Counts a table for each senior
		
		if (numUnder / 7 > tablesNeeded)
		{
			tablesNeeded += (numUnder / 7) - tablesNeeded; // Counts more tables as needed for non-seniors
		}
		
		tables = new Table[tablesNeeded];
		for (int i = 0; i < tables.length; i++)
		{
			if (i < numSeniors) tables[i] = new Table(true); else tables[i] = new Table(false);
		}
	}
}
