package LoopJava;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng số nguyên tố  cần in ra ");
        int numbers = scanner.nextInt();
        int count = 0;
        int num = 2;
        while (count < numbers) {
            boolean check = true;
            for (int i = 2; i < numbers; i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(num);
                count++;
            }num++;
        }
    }

}
