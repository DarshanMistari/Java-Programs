class Exceptionshandling
{
	public static void main(String args[])
	{
		int a=10, b=0,c=0;
		try
		{
			c=a/b;
			System.out.println("Division" +c);
		}
		catch(Exception e)
		{
			System.out.println("Do Not Divided into Zero");
		}
		try
		{
			String str=null;
			System.out.println("Prit theString Value"+str);
		}
	 	catch(Exception e)
		{
			System.out.println("String is Null");
		}
		finally
		{
			System.out.println("Finally Block is Execute");
		}
	}
}