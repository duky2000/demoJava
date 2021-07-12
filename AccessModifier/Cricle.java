package AccessModifier;

public class Cricle {
    private double radius = 1.0;
    private String color = "red";
    public Cricle(){

    }
    public Cricle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

}
class TestCricle{
    public static void main(String[] args) {
        Cricle cricle1 = new Cricle();
        System.out.println(cricle1.getRadius());
        System.out.println(cricle1.getArea());
        Cricle cricle2 = new Cricle(11);
        System.out.println(cricle2.getRadius());
        System.out.println(cricle2.getArea());
    }
}
