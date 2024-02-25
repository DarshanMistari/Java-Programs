import java.util.Scanner;
class ArraySearching
{
	public static void main(String args[])
	{
		int [] a = {10, 23, 30, 34, 15, 20, 35, 40, 45, 50};
		int num;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		num = sc.nextInt();
		boolean Search=Search(a ,num);
		if(Search)
		{
			System.out.println("The Number is Stored in the Array.");
		}
		else
		{
			System.out.println("The Number is not Stored in the Array.");
		}
    }
        public static boolean Search(int []a, int num)
        {
			int i=0;
			while(i < a.length)
			{
				if(a[i] == num)
				{
					return true;
				}
				i++;
			}
			return false;
		}
 }