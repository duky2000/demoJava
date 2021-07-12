package Abstract;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "gà gáy";

    }

    @Override
    public String howToEat() {
        return " gà ăn thóc";

    }
}
