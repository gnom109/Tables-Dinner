/*
 * Logan Pulley
 * Jordain Sharma
 */
import java.util.*;
public class Dinner
{
	public static void main(String[] args)
	{
		Scanner steve = new Scanner(System.in);
		List<Table> tables = new ArrayList<Table>();
		int numSeniors, numUnder;
		
		System.out.print("How many seniors? ");
		numSeniors = steve.nextInt();
		System.out.print("How many other students? ");
		numUnder = steve.nextInt();
		
		System.out.println("Creating " + numSeniors + " senior tables");
		for (int i = 0; i < numSeniors; i++)
		{
			tables.add(new Table(true));
		}
		
		if (numUnder / 7 > tables.size())
		{
			System.out.println("Adding " + (numUnder / 7 - tables.size()) + " overflow tables");
			for (int i = 0; i < (numUnder / 7) - tables.size(); i++)
			{
				tables.add(new Table(false));
			}
		}
		
		
	}
}
