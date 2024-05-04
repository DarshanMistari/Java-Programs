class Rectangle
{
	int length , width;
	public Rectangle (int x,int y)
	{
		length = x;
		width = y;
	}

	int area()
	{
		return (length * width);
	}
}

class Rectangle_Constructor
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(10,20);
		int p = r.area();
		System.out.println(p);
	}
}