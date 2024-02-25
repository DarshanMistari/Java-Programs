import java.util.Scanner;

class Switch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int month;

		System.out.print("Enter the Month in Integer Number:");
		month = sc.nextInt();

		switch(month)
		{
			case 1:
			System.out.println("You are Enter the First Month in January.");
			break;

			case 2:
		    System.out.println("You are Enter the Second Month in February.");
			break;

			case 3:
		    System.out.println("You are Enter the Third Month in March.");
			break;

			case 4:
		    System.out.println("You are Enter the Fourth Month in April.");
			break;

			case 5:
			System.out.println("You are Enter the Fifth Month in May.");
			break;

			case 6:
			System.out.println("You are Enter the Sixth Month in June.");
			break;

			case 7:
			System.out.println("You are Enter the Seventh Month in July.");
			break;

			case 8:
			System.out.println("You are Enter the Eightth Month in August.");
			break;

			case 9:
			System.out.println("You are Enter the Nineth  Month in September.");
			break;

			case 10:
			System.out.println("You are Enter the Tenth Month in October.");
			break;

			case 11:
			System.out.println("You are Enter the Eleventh Month in November.");
			break;

			case 12:
			System.out.println("You are Enter the Twelveth Month in December.");
			break;

			default:
			System.out.println("You are Enter the Invalid Month.");
			break;

			}
	}
}
