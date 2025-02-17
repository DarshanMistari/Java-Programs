import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class ReguralExpresion
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String Name;

		//1. Name is Valid Only 3 Character
		System.out.println("Enter Only 3 Character Capital or Smalle Neither False.\n");
		System.out.println("Enter the Name :");
		Name = sc.next();
		String NameEx = "^[A-Za-z]{0,3}$";
		Pattern pattern1 = Pattern.compile(NameEx);
		Matcher matcher1 = pattern1.matcher(Name);
		System.out.println("Valid Name :"+matcher1.matches());

		//2. Name is Valid Minimum 3 Or Maximum Infinite
		System.out.println("\n\nFirst Letter Capital And Minimum 3 Character Neither False.\n");
		System.out.println("Enter the Name :");
		Name = sc.next();
		String Nameex = "^[A-Z]{1}[A-Za-z]{2,}$";
		Pattern pattern2 = Pattern.compile(Nameex);
		Matcher matcher2 = pattern2.matcher(Name);
		System.out.println("Name is Valid :"+matcher2.matches());


		//3. Mobile No is Valid Only 10 Digit and Numeric value
		System.out.println("\n\nEnter the Only 10 Digit Neither False.\n");
		String MobileNo;
		System.out.println("Enter the Mobile No :");
		MobileNo = sc.next();
		String MobileNoEx = "^[0-9]{10}$";
		Pattern pattern3 = Pattern.compile(MobileNoEx);
		Matcher matcher3 = pattern3.matcher(MobileNo);
		System.out.println("Mobile No is Valid :"+matcher3.matches());
	}
}