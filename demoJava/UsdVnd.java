package demoJava;

import java.util.Scanner;

public class UsdVnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double VNĐ = 23000;
        double USD;
        System.out.println("nhập vào usd ");
        USD = scanner.nextDouble();
        double change = USD*VNĐ;
        System.out.println("giá trị VNĐ là : "+change+" VNĐ");
    }
}
