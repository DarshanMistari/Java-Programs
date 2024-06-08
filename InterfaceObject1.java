interface MyInterface
{
	int a = 20;
	void fun1();
	void fun2();
}
class Myclass implements MyInterface
{
	public void fun1()
	{
		System.out.println("This is Function 1.");
	}

	public void fun2()
	{
		System.out.println("This is Functon 2.");
	}
}
class InterfaceObject1
{
	public static void main(String args[])
	{
		MyInterface  m = new Myclass();
		//Create Object in Interface help to Myclass Contructor.
		//This is Myclass contructor refrance of interface Method and Variable.

		m.fun1();
		m.fun2();
	}
}