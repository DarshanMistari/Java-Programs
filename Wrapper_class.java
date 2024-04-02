class Wrapper_class
{
	public static void main(String args[])
	{
		int num = 20;
		long a = 123434;
		double c = 35.4;
		char d = 'D';

		Integer e = Integer.valueOf(num);
		Integer f = num;

		System.out.println("Primative Integer Datatype :"+ num);
		System.out.println("Primative Datatype:"+ e);
		System.out.println("Primative Datatype :"+ f);

		Long x = Long.valueOf(a);
		Long y = a;
		System.out.println("\n\nPrimative Long Datatype :"+ a);
		System.out.println("Primative Long Datatype "+ x);
		System.out.println("Primative Long Datatype " + y);

		Double m = Double.valueOf(c);
		Double n = c;
		System.out.println("\n\nPrimative Double Datatype:"+ c);
		System.out.println("Primative Double Datatype:"+ m);
		System.out.println("Primative Double Datatype:"+ n);

		Character p =new Character(d);
		Character q = d;
		System.out.println("\n\nPrimative Char Datatype:"+ d);
		System.out.println("Primative Char Datatype:"+ p);
		System.out.println("Primative Char Datatype:"+ q);


	}
}