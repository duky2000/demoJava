package inheritance;

public class Circle1 {
    private double radius;
    private String color;

    public Circle1() {

    }

    public Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return " Circle1{" +
                " radius=" + radius +
                " diện tích là : "+getArea()+
                ", color='" + color + '\'' +
                '}';
    }
}

class Cylinder extends Circle1 {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;

    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getThetich() {
        return getArea() * this.height;
    }

    @Override
    public String toString() {
        return " Cylinder{" +
                " height=" + height +
                " có vòng tròn là : " + super.toString() +
                '}';
    }

    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        System.out.println(circle1);
        circle1 = new Circle1(3.3, "blue");
        System.out.println(circle1);
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(5.5);
        System.out.println(cylinder);
        cylinder = new Cylinder(6.6,3.3,"yellow");
        System.out.println(cylinder);
    }
}
