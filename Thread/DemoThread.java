package Thread;

import java.time.LocalDateTime;

public class DemoThread extends Thread{
    @Override
    public void run() {
        while (true) {
            LocalDateTime gio = LocalDateTime.now();
            int h = gio.getHour();
            System.out.println(h + " : giờ ");
            LocalDateTime mili = LocalDateTime.now();
            int millis = mili.getSecond();
            System.out.println(millis + " : giây ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public void phut() {
        while (true) {
            LocalDateTime minu = LocalDateTime.now();
            int minuMinute = minu.getMinute();
            System.out.println(minuMinute+" : phút  ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {
        DemoThread demoThread1 = new DemoThread();
        DemoThread demoThread2 = new DemoThread();
        demoThread1.start();
        demoThread2.phut();
    }
}
