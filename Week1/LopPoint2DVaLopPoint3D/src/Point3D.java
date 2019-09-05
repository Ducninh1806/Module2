public class Point3D extends Point2D{
    private float z=0;
    Point3D(){
    }

    public Point3D(float x, float y, float z){
        this.z=z;
        super.setX(x);
        super.setY(y);
    }

    public float getZ(){
        return this.z;
    }
    public void setZ(float z){
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] xyz= {super.getX(),super.getY(), getZ()};
        return xyz;
    }

    @Override
    public String toString(){
        return "A Point3D with x= "+ super.getX()+" y= "+super.getY()+" z="+getZ()
                + " ,Which a subclass is \"("+super.getX()+","+super.getY()+","+this.getZ()+")\"";
    }



}
