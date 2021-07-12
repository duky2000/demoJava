package Interface2;

public class Square implements Colorable{
    @Override
    public void howToColor() {
        System.out.println("tô màu cả 4 mặt ");
    }

    private double side = 1.0;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }

    @Override
    public String toString() {
        return " Square{" +
                " side=" + side +
                " diện tích hình vuông là : "+getArea()+
                '}';
    }
}
