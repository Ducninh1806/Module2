public class TestShape {
    public static void main(String[] args) {

        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("rec", true);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);

        circle= new Circle(4);
        System.out.println(circle);

        circle= new Circle(6,"rec",false);
        System.out.println(circle);


        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle= new Rectangle(5,10);
        System.out.println(rectangle);

        rectangle= new Rectangle(8,12,"blue",false);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);

        square= new Square(20);
        System.out.println(square);

        square= new Square(10, "brown", true);
        System.out.println(square);




    }
}
