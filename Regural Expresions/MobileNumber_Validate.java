
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber_Validate{

    public static boolean isValidateMobileNo(String MobileNo )
    {

        Pattern pattern = Pattern.compile("^[0-9]{10}$");
        Matcher matcher = pattern.matcher(MobileNo);

        return (matcher.matches());
    }

    public static void main(String[] args) {
        String MobileNo = "7666866651";

        if(isValidateMobileNo(MobileNo)){
            System.out.println("Mobile Number is Valide.");
        }
        else{
            System.out.println("Mobile Number is Not Valide");
        }
    }
}
