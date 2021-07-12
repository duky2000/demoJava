package Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String str = "^[_a-z0-9]{6,}$";
    public static final String[] accountTrue = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] accountFalse = new String[]{".@", "12345", "1234_", "abcde"};

    public AccountExample() {

    }

    public boolean check(String regex) {
        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String tk : accountTrue) {
            boolean a = accountExample.check(tk);
            System.out.println("tài khoản " + tk + " là " + a);
        }
        for (String tk : accountFalse) {
            boolean b = accountExample.check(tk);
            System.out.println("tài khoản " + tk + " là " + b);
        }
    }
}
