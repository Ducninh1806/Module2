

public class Cylinder extends Circle {
    private double height =1;

    Cylinder(){
    }
    public Cylinder(double height, double radius){
        this.height=height;
        setRadius(radius);
    }

    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return height*Math.PI*getRadius()*getRadius()/3;
    }

    @Override
    public String toString (){
        return "A Cylinder with radius= "+getRadius()+ " and height= "+ getHeight()+ " ,Which is a subclass of "+ super.toString();
    }

}
