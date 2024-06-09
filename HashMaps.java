import java.util.Map;
import java.util.HashMap;
class HashMaps
{
	public static void main(String args[])
	{
		HashMap<String,Integer> map = new HashMap<>();

		//Hashmap Contains Person Name Age
		System.out.println("Add Elements for HashMap.");
		map.put("Kalpesh",18);
		map.put("Kunal",18);
		map.put("Darshan",20);
		map.put("Dinesh",26);
		map.put("Rahul",24);

		System.out.println("All Key Access.");
		System.out.println("ALl key :"+map.keySet());

		System.out.println("\nIterate the HashMap");

		for(Map.Entry<String,Integer> entry: map.entrySet())
		{
			System.out.println("Get Key:"+entry.getKey()+"\tGet Value:"+entry.getValue());
		}

		//Sample for loop
		for(String keys :map.keySet())
		{
			System.out.println("Keys :"+keys + "\tValues :"+map.get(keys));
		}

		System.out.println("\nRemove key and Value:");
		map.remove("Rahul");
		System.out.println(map);

		System.out.println("\nOnly One Key null and Value assign");
		map.put(null,20);
		map.put(null,19);				//Only One key is Null
		System.out.println(map);

		System.out.println("\nMultiple Value is Null");
		map.put("Nitin",null);
		map.put("Sagar",null);
		map.put("Mahendra",null);
		System.out.println(map);

		System.out.println("\nKey Contain Hashmap or Not");
		System.out.println("is Hashmap Conatain Key Darshan:"+map.containsKey("Darshan"));

		System.out.println("\nValue Contain Hashmap or Not");
		System.out.println("is Hashmap Contain Value 20 :"+map.containsValue(20));

	 }
}