import java.util.Scanner;

class For
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int i ,num;
		System.out.print("Enter the Number:");
		num = sc.nextInt();

		for(i=1;i<=num;i++)
		{
			System.out.println(i);
		}
	}
}