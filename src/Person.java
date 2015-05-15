/*
 * Logan Pulley
 * Jordain Sharma
*/
import java.util.*;
public class Person
{
	private int number;
	private List<Table> seatedAt = new ArrayList<Table>();
	
	public void addSeated(Table t)
	{
		seatedAt.add(t);
	}
}