public class Fish implements Animal {
    @Override
    public void move() {
        System.out.println("Fish is swimming in water");
    }

    @Override
    public void eat() {
        System.out.println("Fish like eat Worms");
    }

    @Override
    public void sleep() {
        System.out.println("Fish sleep when it stand still");
    }
}
