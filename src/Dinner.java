/*
 * Logan Pulley
 * Jordain Sharma
 * v0.3 Alpha
 */
import java.util.*;
public class Dinner
{
	public static void main(String[] args)
	{
		Scanner steve = new Scanner(System.in);
		Table[] tables; // Contains all tables
		Person[] seniors, unders;
		int tablesNeeded = 0; // Number of tables needed to seat everyone
		
		System.out.println("DINNER SEATING PROGRAM");
		
		System.out.print("How many seniors? "); // Gets numSeniors
		seniors = new Person[steve.nextInt()];
		for (int i = 0; i < seniors.length; i++)
		{
			seniors[i] = new Person();
		}
		
		System.out.print("How many other students? "); // Gets numUnder
		unders = new Person[steve.nextInt()];
		for (int i = 0; i < unders.length; i++)
		{
			unders[i] = new Person();
		}
		
		tablesNeeded += seniors.length; // Counts a table for each senior
		
		if (unders.length / 7 > tablesNeeded)
		{
			tablesNeeded += (unders.length / 7) - tablesNeeded; // Counts more tables as needed for non-seniors
		}
		
		tables = new Table[tablesNeeded];
		for (int i = 0; i < tables.length; i++)
		{
			if (i < unders.length) tables[i] = new Table(true); else tables[i] = new Table(false);
		}
	}
	
	public void seatPersons()
	{
		for ()
	}
}
