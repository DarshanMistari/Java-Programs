
class ArmstrongNo
{
	public static void main(String args[])
	{
		int num=153 , temp=0 , sum=0 , i;
		temp = num;
		while(num > 0)
		{
			i= num  % 10;
			sum = sum + (i * i * i);
			num = num / 10;
		}
		if(temp == sum)
		{
			System.out.println("It is Armstrong Number.");
		}
		else
		{
			System.out.println("It is Not Armstrong Number.");
	    }
	}
}