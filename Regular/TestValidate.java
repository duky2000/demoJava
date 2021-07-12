package Regular;

public class TestValidate {
    private static final String[] valiTrue = {"C0318G", "A0321G"};
    private static final String[] valiFalse = {"M0318G", "P0323A"};

    public static void main(String[] args) {
        Validate validate = new Validate();
        for (String vali : valiTrue) {
            boolean a = validate.check(vali);
            System.out.println("tên lớp "+ vali+" là "+a);
        }
        for (String vali : valiFalse) {
            boolean b = validate.check(vali);
            System.out.println("tên lớp "+ vali+" là "+b);
        }
    }
}
