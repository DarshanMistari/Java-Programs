import java.util.Scanner;
class ForloopTable
{
	public static void main(String args[])
	{
		int num;
		int i;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number :");
		num = scanner.nextInt();

		for(i=1; i<=10; i++)
		{
			int temp = i * num;
			System.out.println(temp);
		}
	}
}