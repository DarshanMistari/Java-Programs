class Method_Overloading
{
	void add(int a , int b)
	{
		System.out.println("Addition two Number "+(a+b));
	}

	void add(int a, int b, int c)
	{
		System.out.println("Addition Three Number "+(a+b+c));
	}

	public static void main(String args[])
	{
		Method_Overloading a =new Method_Overloading();
		a.add(10,10);
		a.add(10,10,20);
	}
}