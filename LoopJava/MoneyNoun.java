package LoopJava;

import java.util.Scanner;

public class MoneyNoun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = 5.0;
        int month = 5;
        double interest = 2.0;
        System.out.println("nhập vào số tiền bạn gửi ");
        money = input.nextDouble();
        System.out.println("nhập vào số tháng bạn gửi");
        month = input.nextInt();
        System.out.println("nhập vào lãi suất hàng năm ");
        interest = input.nextDouble();
        double total = 0;
        for (int i = 0 ; i < month ; i++){
            total += money*(interest/100)/12*month;
        }
        System.out.println("tổng số tiền lãi là "+total);
    }
}
