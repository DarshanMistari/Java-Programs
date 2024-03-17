interface Print
{
	void display();
}
class Interface implements Print
{
	public void display()
	{
		System.out.println("Hello World");
	}

	public static void main(String args[])
	{
		Interface a = new Interface();
		a.display();
	}
}