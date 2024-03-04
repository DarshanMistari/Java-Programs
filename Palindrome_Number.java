import java.util.Scanner;
class Palindrome_Number
{
	public static void main(String args[])
	{
		int num;
		int remainder;
		int reverse = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number :");
		num = scanner.nextInt();

		int temp = num;

		while(num > 0)
		{
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}

		if(temp == reverse)
		{
			System.out.println("It is  Palindrome Number");
		}
		else
		{
			System.out.println("It is not Palindrome Number");
		}
	}
}

