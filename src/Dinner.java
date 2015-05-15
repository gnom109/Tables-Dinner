/*
 * Logan Pulley
 * Jordain Sharma
 * v0.3 Alpha
 */
import java.util.*;
public class Dinner
{
	private static Table[] tables; // Contains all tables
	private static Person[] seniors, unders;
	private static Scanner steve = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		
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
			tables[i] = new Table();
		}
	}
	
	public void seatPersons()
	{
		for (int i = 0; i < seniors.length; i++)
		{
			tables[i].seat(seniors[i]);
		}
		
		for (int i = 0; i < unders.length; i++)
		{
			tables[i % tables.length].seat(unders[i]);
		}
	}
	
	public void clearTables()
	{
		for (int i = 0; i < tables.length; i++)
		{
			tables[i].clear();
		}
	}
}
