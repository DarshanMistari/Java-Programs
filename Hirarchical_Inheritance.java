class Shape
{
	void shape()
	{
		System.out.println("Shape color is Black");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Draw the Circle Shape");
	}
}
class Square extends Shape
{
	void square()
	{
		System.out.println("Draw the Square Shape");
	}
}
class Hirarchical_Inheritance
{
	public static void main(String args[])
	{
			Circle c = new Circle();
			c.draw();
			c.shape();

			Square s = new Square();
			s.square();
	        s.shape();
	}
}