public class Square_Increment_Num {
    
    public static void main(String[] args) {
        int rows=5;
        System.out.println("Square of Increment Numbers from Right Side\n");

	for (int i = 1; i <=rows; i++)
	{
		for (int j = 1; j <= rows - i; j++)
		{
			System.out.print("1 ");
		}
		for (int k = 1; k <= i; k++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
    }
}
