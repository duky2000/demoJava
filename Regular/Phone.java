package Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    private static final String phone = "^\\(\\d{2}\\)[-]\\([0]\\d{9}\\)$";
    public Phone(){

    }
    public boolean check(String regex){
        Pattern pattern = Pattern.compile(phone);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
