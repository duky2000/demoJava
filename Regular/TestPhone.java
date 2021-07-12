package Regular;

public class TestPhone {
    private  static final String[] phoneTrue = {"(84)-(0978489648)"};
    private  static final String[] phoneFalse = {" (a8)-(22222222)"};

    public static void main(String[] args) {
        Phone newPhone = new Phone();
        for (String phone :phoneTrue) {
            boolean a = newPhone.check(phone);
            System.out.println("số phone "+phone+" là "+a);
        }
        for (String phone :phoneFalse) {
            boolean b = newPhone.check(phone);
            System.out.println("số phone "+phone+" là "+b);
        }
    }
}
