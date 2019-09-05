public class Circle extends Shape{
    private double radius= 1;

    Circle(){

    }

    Circle(double radius){
        this.radius=radius;
    }

    Circle(double radius, String color, boolean filled){
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

    @Override
    public String toString(){
        return "A Circle with color of "
                +getRadius()
                +" Which is a subclass of "
                + super.toString();
    }



}
