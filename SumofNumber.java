import java.util.Scanner;
class SumofNumber
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int num ,sum=0,i=1;

		System.out.print("Enter the Number :");
		num =scanner.nextInt();

		for( i=1; i<=num; i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of the Number :"+sum);
	}
}