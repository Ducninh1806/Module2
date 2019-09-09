public class Dog implements Animal{

    @Override
    public void move() {
        System.out.println("Dogs move by his hands");
    }

    @Override
    public void eat() {
        System.out.println("Dogs like eat bones");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep in daylight");
    }
}
