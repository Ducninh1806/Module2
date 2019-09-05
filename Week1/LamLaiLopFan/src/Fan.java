public class Fan {
    private int slow =1;
    private int medium = 2;
    private int fast =3;

    public int speed = this.slow;
    public boolean on= false;
    public double radius = 5;
    public String color = "blue";

    public int getSpeed(){
         return this.speed;
    }
    public void setSpeed(int speed){
        this.speed= speed;
    }

    public boolean getIsOn(){
        return this.on;
    }
    public void setIsOn(boolean on){
        this.on= on;
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

    Fan(){}

    public String toString (){
        return ((!this.on)? "fan is on":"fan is off") + " speed= "+this.getSpeed()+ " Radius= "+ getRadius()
                + " color= "+ getColor();
    }


}
