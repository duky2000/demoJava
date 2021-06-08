package LoopJava;


public class InPrimeNumber {
    public static void main(String[] args) {
        int numbers = 2;
        while (numbers < 100) {
            boolean check = true;
            for (int i = 2; i < numbers; i++) {
                if (numbers % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("các số nguyên tố dưới 100 là : " + numbers);
            }
            numbers++;
        }
    }
}
