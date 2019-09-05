import javax.swing.*;

public class MoveablePoint extends Point{
    private float xSpeed=0;
    private float ySpeed=0;

    MoveablePoint(){
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed= ySpeed;
        super.setX(x);
        super.setY(y);
    }

    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {

        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed= xSpeed;
        this.ySpeed= ySpeed;
    }

    public float[] getSpeed(){
        float[] speed= {this.xSpeed,this.ySpeed};
        return speed;
    }

    public MoveablePoint move(){
        super.setX(super.getX()+this.getxSpeed());
        super.setY(super.getY()+this.getySpeed());

        return this;
    }


    @Override
    public String toString(){
        return "\""+super.toString()+" ,speed= ("+this.getxSpeed()+","+this.getySpeed()+")\"";



    }










}
