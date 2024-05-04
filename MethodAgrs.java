import java.util.Scanner;
class MethodArgs
{
	public static void main(String args[])
	{
	   int a = sum();
	   int b = sum();

	   int c = a + b;
	   System.out.println("Addition :"+ c);
	}

	public static int sum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a = sc.nextInt();

		return a;
	}
}