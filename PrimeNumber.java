import java.util.Scanner;
class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

		int num , a=0;

		System.out.print("Enter the Number :");
		num = scanner.nextInt();

		for(int i=1; i<=num; i++)
		{
			if(num % i == 0)
			{
				a++;
			}
		}
		if(a==2)
		{
			System.out.println("It Is Prime Number");
		}
		else
		{
			System.out.println("It is not Prime Number");
		}
	}
}