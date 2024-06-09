import java.util.HashSet;
import java.util.Iterator;
class Hashset
{
	public static void main(String args[])
	{
		HashSet<Integer> set = new HashSet<Integer>();

		//Vlaue is Add for Hashset
		System.out.println("Add Elements for set.");
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10); //HashSet is only contain qunick Value
		set.add(40);
		set.add(50);
		set.add(60);


		//Display all Values
		System.out.println("Display Elements for set.");
		System.out.println(set);

		//Remove Elements in set
		System.out.println("10 is Remove Element for Set.");
		set.remove(10);
		System.out.println(set);

		//Searsh element of Hashset

		if(set.contains(60))
		{
			System.out.println("Hashset containt 60");
		}

		if(!set.contains(80))
		{
			System.out.println("Hashset does not containt 80");
		}

		//size of the Hashset
		System.out.println("Count the Size of set");
		System.out.println(set.size());

		//Iterator
		System.out.println("Iterator in Hashset");
		Iterator  it = set.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}