package AccessModifier;

public class TestManager {
    public static void main(String[] args) {
        Manager[] managers = new Manager[0];
        managers = Manager.create(managers);
        managers = Manager.create(managers);
        for (int i = 0; i < managers.length; i++) {
            System.out.println(managers[i].toString());
        }
        managers = Manager.edit(managers);
        for (int i = 0; i < managers.length; i++) {
            System.out.println(managers[i].toString());
        }
        managers = Manager.delete(managers);
        for (int i = 0; i < managers.length; i++) {
            System.out.println(managers[i].toString());
        }
    }
}
