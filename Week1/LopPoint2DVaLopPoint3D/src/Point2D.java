public class Point2D {
    private float x = 0;
    private float y = 0;

    Point2D() {
    }

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] xy = {this.getX(),this.getY()};
        return xy;
    }

    @Override
    public String toString(){
        return "A Point2D with x= "+ getX()+ " ,y= "+ getY()+ " position \" ("+ this.getX()+","+this.getY()+") \"";
    }


}
