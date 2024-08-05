class Solid_Rhombus{
    public static void main(String[] args) {
        
        int num = 5;

        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=num-i; j++)
            {
                System.err.print(" ");
            }

            for(int j=1; j<=5; j++)
            {
                System.err.print("*");
            }
            System.err.println("");
        }
    }
}