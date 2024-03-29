public class Circle {
    private double radius =1;
    private String color= "rec";

    Circle(){
    }

    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public double getArea(){
        return radius*radius*2*Math.PI;
    }

    @Override
    public String toString(){
        return "A Circle with radius= "+ radius+ " ,and color = "+ getColor();
    }
}
