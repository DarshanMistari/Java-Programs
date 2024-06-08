import java.util.Scanner;
class MobileNumber extends RuntimeException
{
	 MobileNumber(String message)
	 {
		 super(message);
	 }
}
class CustomException2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		String Name;
		int MobileNo;
		System.out.println("Enter the Your Name :");
		Name = sc.next();
		System.out.println("Enter the Your Mobile Number :");
		MobileNo = sc.nextInt();

		try
		{
			if(MobileNo < 10)
			{
				throw new MobileNumber("Please Enter the Correct  Mobile Number 10 Digit.");
			}
		}

		catch(MobileNumber mn)
		{
			System.out.println(mn.getMessage());
	    }
	}

}