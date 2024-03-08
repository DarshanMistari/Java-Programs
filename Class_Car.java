class Class_Car
{
	public String brand;
	public String model;
	public int year;

	public void StartEgine()
	{
		System.out.println("Start the Engine of a :"+ this.year+" " + this.brand +" "+ this.model);
	}

	public void accelerate()
	{
		System.out.println("Accelerating...");
	}

	public void brake()
	{
		System.out.println("Applying the Brakes.");
	}

	public static void main(String args[])
	{
		Class_Car car= new Class_Car();
		car.brand = "Toyota";
		car.model = "Camry";
		car.year = 2024;

		car.StartEgine();
		car.accelerate();
		car.brake();
	}
}