package Thread;

import java.time.LocalDateTime;
import java.util.Random;

public class Xe extends Thread{
    private String name;
    private int km;
    public Xe(String name,int km){
        this.name = name;
        this.km = km;
    }
    @Override
    public void run(){
        int run = 0;
        long startTime =  System.currentTimeMillis();
        int khoangCach = 1000;
        while (run<khoangCach){
            try {
                run += km;
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        long stopTime = System.currentTimeMillis();
        System.out.println(name+" đua xong");
        System.out.println(stopTime-startTime+" km");

    }

    public static void main(String[] args) {
        Xe xe1 = new Xe("xe1",150);
        Xe xe2 = new Xe("xe2",250);
        Xe xe3 = new Xe("xe3",350);
        xe1.start();
        xe2.start();
        xe3.start();
    }
}
