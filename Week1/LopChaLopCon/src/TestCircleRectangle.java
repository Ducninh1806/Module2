public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle c= new Circle(1);
        c.setFilled("yellow");

        System.out.println("A circle : "+ c.toString());
        System.out.println("the radius is: "+ c.getRadius());
        System.out.println("the radius is: "+ c.getRadius());
        System.out.println("the area is: "+ c.getArea());
        System.out.println("the perimeter is: "+ c.getPerimeter());
        System.out.println();

        Rectangle r= new Rectangle(2,4);
        System.out.println("A rectangle: "+r.toString());
        System.out.println("the area is: "+ r.getArea());
        System.out.println("the perimeter is: "+ r.getPerimeter());
        System.out.println();



    }
}
