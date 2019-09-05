public class Circle extends Geometic {
    private double radius;

    Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(String color, String filled, double radius){
        this.radius=radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius= radius;
    }

    public double getArea(){
        return radius*radius*2*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public void sprintCircle(){
        System.out.println("The "+getColor()+" circle is creat with the radius is: "+ radius);
    }

}
