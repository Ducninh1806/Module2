import javafx.css.converter.PaintConverter;

public class Rectangle extends Shape {
    private double width=1;
    private double height=1;

    Rectangle(){

    }

    Rectangle(double width, double height){
        this.width=width;
        this.height= height;
    }

    Rectangle(double width, double height, String color, boolean filled){
        this.width=width;
        this.height=height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width=width;
    }

    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*(width*height);
    }

    @Override
    public String toString(){
        return "A Rectangle with width= "+ width+" and height= "+height
                +" ,Which is a subclass of "
                + super.toString();
    }


}
