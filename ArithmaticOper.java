import java.util.Scanner;
class ArithmaticOper
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int a,b,c;

		System.out.print("Enter the First Num :");
		a=sc.nextInt();

		System.out.print("Enter the Second Num :");
		b=sc.nextInt();

		c = a + b;
		System.out.println("\n Addtion :"+c);

		c = a - b;
		System.out.println("Substraction :"+c);

		c = a * b;
		System.out.println("Multiplication :"+c);

		c = a / b;
		System.out.println("Divided :"+c);

		c = a % b;
		System.out.println("Modulas :"+c);

	}
}