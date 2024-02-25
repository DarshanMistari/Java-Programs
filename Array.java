import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];

		int i;

		System.out.println("Enter the Number:");
		for(i=0;i<=4;i++)
		{
			a[i]= sc.nextInt();
		}

		System.out.println("Array of the Elements.");

		for(i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
	}
}