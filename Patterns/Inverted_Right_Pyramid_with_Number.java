public class Inverted_Right_Pyramid_with_Number {
    
    public static void main(String[] args) {
        
        int num = 5 ;

        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=num-i+1; j++)
            {
                System.err.print(j);
            }
            System.err.println();
        }
    }
}
