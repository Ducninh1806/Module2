package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public void makeSound() {
        System.out.println("Chicken sound chip chip!!");
    }

    @Override
    public void HowtoEat() {
        System.out.println("Chicken like ride");
    }
}
