class String_Function
{
	public static void main(String args[])
	{
		String name = "Darshan";
		String lname = "Mistari";

		System.out.println("\n String Concatnate :" + name.concat(lname));

		System.out.println("\n String Equal :" + name.equals(lname));

		System.out.println("\n String toUpperCase : "+ name.toUpperCase());

		System.out.println("\n String toLowerCase :" + lname.toLowerCase());

		System.out.println("\n String length :" + name.length());

		System.out.println("\n String chartAt :" + name.charAt(1));

		System.out.println("\n String Substring :"+ name.substring(0,5));

		System.out.println("\n String IndexOf :" + name.indexOf("a"));
	}
}