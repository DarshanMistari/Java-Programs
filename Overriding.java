class Display
{
	void show()
	{
		System.out.println("Show Parents Class");
	}
}
class child extends Display
{
	void show()
	{
		System.out.println("Show Child Class");
	}
}
class Overriding
{
	public static void main(String args[])
	{
		child obj = new child();
		obj.show();
	}
}