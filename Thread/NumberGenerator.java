package Thread;

public class NumberGenerator implements Runnable {
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " , ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator("A");
        Thread thread1 = new Thread(numberGenerator1);
        thread1.start();
        NumberGenerator numberGenerator2 = new NumberGenerator("B");
        Thread thread2 = new Thread(numberGenerator2);
        thread2.start();
    }
}
