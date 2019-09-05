public class printCircleRectangle {
    public static void main(String[] args) {
        Circle circle= new Circle(1);
        circle.getArea();
        circle.getPerimeter();
        circle.setColor("yellow");
        System.out.println("the Area of Circle is: "+ circle.getArea()+" and Perimeter is: "+ circle.getPerimeter()+" color is"+circle.getColor());


        Rectangle rectangle= new Rectangle(4,6);
        rectangle.getArea();
        rectangle.getPerimeter();
        rectangle.setColor("yellow");
        System.out.println("The Area of rectangle is: "+ rectangle.getArea()+" , Perimeter is: "+ rectangle.getPerimeter()+ " and color is: "+rectangle.getColor());

        




    }
}
