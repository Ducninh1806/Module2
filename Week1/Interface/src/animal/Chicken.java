package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken sound Chip Chip";
    }

    @Override
    public String HowtoEat() {
        return "could be fried";
    }
}
