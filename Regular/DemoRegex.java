package Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String str = "^[a-z A-Z 0-9]+[a-z A-Z 0-9]*@[a-z A-Z 0-9]+\\.[a-z A-Z 0-9]+$";
    public static final String[] emailTrue = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] emailFalse = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
    public DemoRegex(){
        pattern = Pattern.compile(str);
    }
    public boolean check(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        DemoRegex demoRegex = new DemoRegex();
        for (String email :emailTrue) {
            boolean a = demoRegex.check(email);
            System.out.println(" email "+email+" là "+a);
        }
        for (String email :emailFalse) {
            boolean b = demoRegex.check(email);
            System.out.println(" email "+email+" là "+b);
        }
    }
}

