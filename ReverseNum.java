import java.util.Scanner;
class ReverseNum
{
public static void main(String args[])
{
    int num, rev;
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the NUmber :");
    num = sc.nextInt();

    while(num > 0)
    {
		rev =num %10;
		num=num/10;
		System.out.print(rev);
    }
    System.out.println("\n");
  }
}