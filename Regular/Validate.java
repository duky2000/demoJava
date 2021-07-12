package Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String str = "^[ACP]\\d{4}[GHIKLM]$";
    public Validate(){

    }
    public boolean check(String regex){
        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
