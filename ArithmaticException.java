import java.util.Scanner;
class ArithmaticException
{
	public static void main(String args[])
	{
		Scanner sc =new  Scanner(System.in);
		int a , b, c=0;

		System.out.println("Enter the A and B Value :");
		a = sc.nextInt();
		b = sc.nextInt();

		try
		{
			c=a/b;
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Do Not Divided By Zero.");
		}
		finally
		{
			System.out.println("Code Block is Done.");
		}
		System.out.println("Division :"+c);

	}
}