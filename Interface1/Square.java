package Interface1;

public class Square extends Rectangle implements Resizeable {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }


    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void resize(double persent) {
        setSide(side*persent);
    }
}
