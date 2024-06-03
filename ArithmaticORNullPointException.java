import java.util.Scanner;
class ArithmaticORNullPointException
{
	public static void main(String args[])
	{
		Scanner sc =new  Scanner(System.in);
		int a , b, c=0;
		String name= null;

		System.out.println("Enter the A and B Value :");
		a = sc.nextInt();
		b = sc.nextInt();

		try
		{
			c=a/b;
			System.out.println("String Length :"+name.length());
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Do Not Divided By Zero.");
		}
		catch(NullPointerException ex)
		{
			System.out.println("Please Enter the Name.");
			System.out.println("System Message :"+ex.getMessage());
		}
		finally
		{
			System.out.println("Code Block is Done.");
		}
		System.out.println("Division :"+c);

	}
}