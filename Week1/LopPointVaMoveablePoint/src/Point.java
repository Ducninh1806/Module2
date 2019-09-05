public class Point {
    private float x=0;
    private float y=0;

    Point(){
    }
    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX(){
        return this.x;
    }
    public void setX(float x){
        this.x=x;
    }

    public float getY(){
        return this.y;
    }
    public void setY(float y){
        this.y=y;
    }

    public void setXY(float x, float y){
        this.x =x;
        this.y =y;
    }

    public float[] xy(){
        float[] xy= {this.x,this.y};
        return xy;
    }

    @Override
    public String toString (){
        return "The Point with ("+ this.getX()+","+this.getY()+")";
    }





}
