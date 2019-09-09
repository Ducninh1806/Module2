import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.Apple;
import edible.Fruit;
import edible.Orange;

public class Test {
    public static void main(String[] args) {
        Animal[] animals= new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        for (Animal animal: animals){
            animal.makeSound();
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0]= new Apple();
        fruits[1]= new Orange();
        for (Fruit fruit : fruits){
            fruit.HowtoEat();
        }


    }
}
