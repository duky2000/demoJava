package Interface2;

public class TestSquare {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(3.0);
        squares[1] = new Square(4.0);
        squares[2] = new Square(5.0);
        for (Square square : squares
        ) {
            System.out.println(square);
            square.howToColor();
        }
    }
}
