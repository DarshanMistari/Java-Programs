import java.util.Scanner;
class FactorialNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	    int i,fact=1,num;

		System.out.print("Enter the Number:");
		num = sc.nextInt();

		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial Number:"+fact);
	}
}