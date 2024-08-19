
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name_Validation {
    
    public static boolean isNameValidate(String name)
    {

        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{6,}$");
        Matcher matcher = pattern.matcher(name);

        return (matcher.matches());
    }

    public static void main(String[] args) {

        System.out.println("Entert the Name :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        if( isNameValidate(name))
        {
            System.out.println(name +" is Validate Name");
        }
        else{
            System.out.println(name +" is not Validate Name.");
        }
    }
}
