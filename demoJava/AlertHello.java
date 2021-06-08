package demoJava;

import java.util.Scanner;

public class AlertHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên ");
        String name = scanner.nextLine();
        System.out.println(" Hello "+name);
    }
}
