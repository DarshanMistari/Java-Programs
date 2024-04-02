class ConstructorAndParameterize
{
	public ConstructorAndParameterize()
	{
		System.out.println("Hello Every One");
	}
	public ConstructorAndParameterize(int a)
	{
		System.out.println("Number :"+a);
	}
	public static void main(String args[])
    {
		ConstructorAndParameterize c = new ConstructorAndParameterize();

		ConstructorAndParameterize a = new ConstructorAndParameterize(10);
	}
}