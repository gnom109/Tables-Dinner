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
		
		for (int i = 0; i < numSeniors; i++)
		{
			tables.add(new Table());
		}
	}
}
