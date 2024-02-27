class StringAllFunction
{
	public static void main(String args[])
	{
		String namelength = "Java is Object Oriented Programming Language.";
		String lang = "Java Programming";
		String developer = " Developed by James Gosling";

		System.out.println("Length of String :"+ namelength.length() );

		System.out.println("String Concatention   :" + lang.concat(developer) );

		System.out.println("String is Equal or Not :" + lang.equals(developer) );

		System.out.println("String Trime Fuction  :" + developer.trim() );

		System.out.println("String Start With Fun :"+ lang.startsWith("Java"));

		System.out.println("String End With Fun  :" + lang.endsWith("ing") );

		System.out.println("String Replace Fun   :" + lang.replace("Java Programming","Java is Object Oriented"));
	}
}