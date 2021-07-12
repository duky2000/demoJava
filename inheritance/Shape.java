package inheritance;

import java.util.Scanner;

public class Shape {
    private String color = "red";

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

}


class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }


    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea() {
        return Math.pow((getPerimeter() / 2 * (getPerimeter() / 2 - side1) * (getPerimeter() / 2 - side2) * (getPerimeter() / 2 - side3)), 0.5);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                " chu vi : " + getPerimeter() +
                " diện tích : " + getArea() +
                " " + super.toString() +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập side1 : ");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập side2 : ");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập side3 : ");
        double side3 = Double.parseDouble(scanner.nextLine());
        System.out.println(" nhập color : ");
        String color = scanner.nextLine();
        Triangle triangle = new Triangle(side1, side2, side3, color);
        System.out.println(triangle);
    }
}

