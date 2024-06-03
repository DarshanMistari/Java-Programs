import java.util.Scanner;
class AgeException extends RuntimeException
{
	AgeException(String message)
	{
		super(message);
	}
}

class CustomeException
{
	public static void main(String args[])
	{
		int age;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		age = sc.nextInt();

		try
		{
			if(age < 18)
			{
			   throw new AgeException("Please Enter greater than 18 Age.");
		    }
		}
		catch(AgeException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}