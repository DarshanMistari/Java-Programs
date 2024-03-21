class Commandline
{
	public static void main(String args[])
	{
		int num;
		num=Integer.parseInt(args[0]);

		if(num % 2 == 0)
		{
			System.out.println("It is Even Number.");
		}
		else
		{
			System.out.println("It is Odd Number");
		}
	}
}