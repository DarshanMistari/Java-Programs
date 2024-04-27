class StaticVariable
{
	 static int a;

	public static void main(String args[])
	{
		StaticVariable staticVariable = new StaticVariable();

		StaticVariable staticVariable1 = new StaticVariable();

		staticVariable.a=10;

		staticVariable1.a=20;

		System.out.println("static Variable :"+ a);
	}
}