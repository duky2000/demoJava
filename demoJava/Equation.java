package demoJava;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        System.out.println("cho phương trình 'ax + b = c'");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a :");
        double a = scanner.nextDouble();
        System.out.println("nhập b :");
        double b = scanner.nextDouble();
        System.out.println("nhập c :");
        double c = scanner.nextDouble();
        if (a!=0){
            double answer = (c-b)/a ;
            System.out.println("phương trình có nghiệm là "+ answer);
        }else if (b==c){
            System.out.println("phương trình vô số nghiệm");
        }else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
