package Thread;

import java.time.LocalDateTime;

public class SoNguyenTo1 implements Runnable{
    @Override
    public void run() {
       long startTime = System.currentTimeMillis();
       display(100000);

        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime-startTime);
    }
    public static boolean check(int number){
        if (number<2){
            return false;
        }
        else {
            for (int i = 2 ; i<number;i++){
                if (number%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void display(int number){
        for (int i = 0; i < number; i++) {
            if (check(i)){
                System.out.println("SNT1 là : "+i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
