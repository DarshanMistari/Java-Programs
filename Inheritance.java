class parents
{
	void show()
	{
		System.out.println("Parent Class Show Method");
	}

	void display()
	{
		System.out.println("Parent Class Display Method");
	}
}
class Inheritance extends parents
{
	void set(int a)
	{
		System.out.println("A is stored value :"+a);
	}

	public static void main(String args[])
	{
		Inheritance inherit = new Inheritance();
		inherit.set(10);
		inherit.show();
		inherit.display();
	}
}
