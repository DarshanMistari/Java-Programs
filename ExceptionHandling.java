class ExceptionHandling
{
	public static void main(String args[])
	{
		int a=10, b=0, c=0;
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Do Not Division by Zero ");
		}
		c=a/(a+b);
		System.out.println(c);
	}
}