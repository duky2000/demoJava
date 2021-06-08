package LoopJava;

public class InFigure {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; i <= j; j++) {
                System.out.println("*");
            }
            System.out.println("\n");
            break;
        }
    }
}

