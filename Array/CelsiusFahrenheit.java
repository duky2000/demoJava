package Array;

import java.util.Scanner;

public class CelsiusFahrenheit {
    public static double Celsius(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double Fahrenheit(double fahrenheit) {
        double celsius = (5.0 / 9) * fahrenheit - 32;
        return celsius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        System.out.println("nhập để chuyển từ OF sang OC : ");
        fahrenheit = scanner.nextDouble();
        System.out.println("nhiệt độ chuyển từ OF sang OC là : " + Fahrenheit(fahrenheit));
        System.out.println("nhập để chuyển từ OC sang OF : ");
        celsius = scanner.nextDouble();
        System.out.println("nhiệt độ chuyển từ OC sang OF là : " + Celsius(celsius));


    }
}
