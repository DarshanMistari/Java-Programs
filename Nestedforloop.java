import java.util.Scanner;
class Nestedforloop
{
	public static void main(String args[])
	{
		int num , temp=0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number of Table :");
		num = scanner.nextInt();

		for(int i=1; i<=10; i++)
		{
			temp = i * num;

			System.out.println(temp);
		}
	}
}