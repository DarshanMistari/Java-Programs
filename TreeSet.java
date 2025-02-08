import java.util.*;
import java.util.Map;
import java.util.TreeMap;
class TreeSet
{
	public static void main(String args[])
	{
		Map<String> citie = new TreeMap<>();

		citie.add("Pune");
		citie.add("Mumbai");
		citie.add("Bangorole");
		citie.add("Hydrabad");

		System.out.println(citie);
	}
}