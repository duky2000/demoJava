package AccessModifier;


public class Test {
    public static class Cha {
        public void say() {
            System.out.println("hello");
        }

    }

    static class Con extends Cha {
        @Override
        public void say() {
            System.out.println("hi");
            super.say();
        }
    }

    public static void main(String[] args) {
        Con con = new Con();
        con.say();
    }
}
