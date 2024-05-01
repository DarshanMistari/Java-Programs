import java.util.Scanner;
class ArmstrongNum
{
	public static void main(String args[])
	{
		int num;
		int r=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		num =sc.nextInt();

		int temp =num;

		while(num > 0)
		{
			r = num%10;
			sum = sum+(r*r*r);
			num=num/10;
		}
		if(temp == sum)
		{
			System.out.println("It is Armstrong Number.");
		}
		else
		{
			System.out.println("It is not Armstrong Number.");
		}
	}

}