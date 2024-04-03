import java.util.Scanner;
class PalindromeNumber
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int num,remainder=0,rev=0;

		System.out.print("Enter the Number :");
		num = scanner.nextInt();

		int temp = num;

		while(num >0)
		{
			remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}

		if(temp == rev)
		{
			System.out.println("It is Palindrome Number.");
		}
		else
		{
			System.out.println("It is Not Palindrome Number.");
		}

	}
}