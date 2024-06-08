interface MyInterface
{
	void fun1();
	void fun2();
	default void fun3()
	{
		System.out.println("This is Function 3.");
	}
	static void fun4()
	{
		System.out.println("This is Function 4.");
	}
}
class InterfaceObject2
{
	public static void main(String args[])
	{
		MyInterface m = new MyInterface(){

			public void  fun1()
			{
				System.out.println("This is Function 1.");
			}

			public void fun2()
			{
				System.out.println("This is Function 2.");
			}
		};
		m.fun1();
		m.fun2();
		m.fun3();
	}
}