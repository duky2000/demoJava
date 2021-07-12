package Interface1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];

        circles[0] = new Circle(5.5);
        circles[1] = new Circle(6.6);
        circles[2] = new Circle(7.7);


        for (Circle circle:circles) {
            System.out.println("diện tích trước khi thay đổi : " + circle.getArea());
            circle.resize(Math.random()*100);
            System.out.println("diện tích sau khi thay đổi : " + circle.getArea());

        }
    }
}
