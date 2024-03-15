class Animal
{
	public void eat()
	{
		System.out.println("Animal is Eating");
	}

	public void sleep()
	{
		System.out.println("Animal is Sleep");
	}
}
class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Dog is Barking");
	}
}
 class Animal_SingleInherit
{
	public static void main(String args[])
	{
		Dog animal = new Dog();
		animal.eat();
		animal.sleep();
		animal.bark();
	}
}