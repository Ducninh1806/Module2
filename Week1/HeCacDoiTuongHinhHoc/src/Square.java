public class Square extends Rectangle{
    Square(){

    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color,boolean filled){
        super(side,side,color,filled);
    }

    public double getSide(){
        return this.getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width){
        setSide(width);
    }

//    @Override
//    public void setLength(double length){
//        setSide(length);
//    }

    @Override
    public String toString(){
        return "A Square with side= "+ getSide()+" ,Which is a subclass of "+ super.toString();
    }


}
