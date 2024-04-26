class StringFunction
{
	public static void main(String args[])
	{
		String name = "Every thing is Possible ";

		String name2 = "Just Belive in your Self";

		System.out.println("String Length :"+ name.length());

		System.out.println("String UpperCase :"+ name.toUpperCase());

		System.out.println("String LowerCase :"+ name.toLowerCase());

		System.out.println("String Character at Position :"+ name.charAt(2));

		System.out.println("String Last Index :" + name.lastIndexOf("e"));

		System.out.println("String concat :"+ name.concat(" just Belive in our Self."));

		System.out.println("String Substring :"+name.substring(15));

		System.out.println("String Equal :"+ name.equals("just Belive in our Self."));

		System.out.println("Stirng trime :"+ name.trim());

		//System.out.println("String Start with :"+ name.startWith("E"));

		//System.out.println("String EndWith :"+ name.endWith("l"));

		System.out.println("String Replace :"+ name.replace("Every thing is Possible","Just Belive in your Self"));
	}
}