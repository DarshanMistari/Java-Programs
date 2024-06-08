interface Interface1
{
	void fun1();

	default  void fun2()
	{
		System.out.println("This is Fuction 2 in Interface 1.");
	}

	static void fun3()
	{
		System.out.println("This is Function 3 in Interface 1.");
	}
}
interface Interface2
{
	void fun1();
}
class Myclass implements Interface1,Interface2
{
	public void fun1()
	{
		System.out.println("This is Function 1.");
	}
}
class InterfaceObject3
{
	public static void main(String args[])
	{
		Myclass m = new Myclass();
		m.fun1();
		m.fun2();
		Interface1.fun3();

	}
}