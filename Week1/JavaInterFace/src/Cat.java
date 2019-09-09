public class Cat implements Animal {
    @Override
    public void move() {
        System.out.println("Run as fast as possible");
    }

    @Override
    public void eat() {
        System.out.println("Cat like Mouse");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep anywhere it like");
    }
}
