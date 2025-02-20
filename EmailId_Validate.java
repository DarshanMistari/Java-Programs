
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailId_Validate {
    
    public static boolean isEmailValidate(String email)
    {
        
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_+&*-]+@" +  "[a-zA-Z0-9-]+" + "\\." + "[a-z" + "]{2,3}$");
        Matcher matcher = pattern.matcher(email);
        return (matcher.matches());
    }

    public static void main(String[] args) {
        String email = "darshan@gmail.com";

        if(isEmailValidate(email))
        {
            System.out.println("Email id is Validate.");
        }
        else
        {
            System.out.println("Email id is Not Validate.");
        }
    }
}
