
class superKeyword extends Super
{
	void Show()
	{
		System.out.println("Parent Show");
	}
}
class Child extends superKeyword
{
	void Show()
	{
		super.Show();

			System.out.println("Child Show");

	}
}
class Super
{
	public static void main(String[] args)
	{
		Child s = new Child();
		s.Show();
	}
}
