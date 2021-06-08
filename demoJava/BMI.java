package demoJava;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cân nặng của bạn ");
        double width = scanner.nextDouble();
        System.out.println("nhập chiều cao của bạn");
        double height = scanner.nextDouble();
        double bmi = width/Math.pow(height,2);// bmi = width/(height*height)
        if (bmi<18){
            System.out.println("chỉ số "+bmi+" thiếu cân");
        }else  if (bmi<25.0){
            System.out.println("chỉ số "+bmi+" trung bình");
        }else if (bmi<30.0){
            System.out.println("chỉ số "+bmi+" thừa cân");
        }else {
            System.out.println("chỉ số "+bmi+" béo phì");
        }
    }
}
