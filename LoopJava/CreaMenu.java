package LoopJava;

import java.util.Scanner;

public class CreaMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập 1 Menu");
        System.out.println("1. Vẽ 1 hình vuông");
        System.out.println("2. Vẽ 1 hình chữ nhật");
        System.out.println("3. Vẽ 1 hình tam giác");
        System.out.println("0. Exit");
        System.out.println("nhập lựa chọn của bạn");
        int choice = sc.nextInt();
        switch (choice){
            case 1 :
                System.out.println("Hình vuông");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                break;
            case 2 :
                System.out.println("hình chữ nhật");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                break;
            case 3 :
                System.out.println("hình tam giác");
                System.out.println("*");
                System.out.println("* *");
                System.out.println("* * *");
                System.out.println("* * * *");
                System.out.println("* * * * *");
                break;
            case 0 :
                System.exit(0);
            default:
                System.out.println("không có lựa chọn nào");
        }
    }
}
