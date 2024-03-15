abstract class abc
{
abstract void show();
}
class Abstracts extends abc
{
	public void show()
	{
		System.out.println("Show abstract Class Method");
	}

	public static void main(String args[])
	{
		Abstracts a = new Abstracts();
		a.show();
	}
}