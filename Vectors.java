import java.util.List;
import java.util.Vector;
class Vectors
{
	public static void main(String args[])
	{
		List<String> name = new Vector<>();

		//Add Function
		name.add("Darshan");
		name.add("Kalpesh");
		name.add(1,"Kunal");
		name.add("Rahul");		//add Object in index
		name.add(3,"Dinesh");

		System.out.println("\nVector Objects Add:"+name);

		//Remove Function
		name.remove("Rahul");
		System.out.println("\nVector Objects Remove:"+name);

		//Iterate
		System.out.println("\nIterate in Vector Objects:");
		for(String str : name)
		{
			System.out.println(str);
		}

		System.out.println("\nThis Loop is Distup the Object is Not good Practice for Loop.");
		for(int i=0; i<name.size(); i++)
		{
			System.out.println(name.get(i));
		}
	}
}