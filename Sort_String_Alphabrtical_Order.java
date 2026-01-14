
import java.util.Arrays;

public class Sort_String_Alphabrtical_Order {
    
    public static void main(String[] args) {
        
        String [] fruits = {"Orange", "Grapes","Apple"};

        Arrays.sort(fruits);
        System.err.println("Sorted String :");
        
        for(String f : fruits){
            System.err.println(f);
        }
    }
}
