package demoJava;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập năm để kiểm tra :");
        int year = scanner.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println(year+" là năm nhuận");
                }else {
                    System.out.println(year+" không phải năm nhuận");
                }
            }else {
                System.out.println(year+" là năm nhuận");
            }
        }else {
            System.out.println(year+" không phải là năm nhuận");
        }
    }
}
