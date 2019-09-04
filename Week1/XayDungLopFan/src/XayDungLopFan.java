public class XayDungLopFan {
    int slow =1;
    int medium = 2;
    int fast =3;

    private int speed = slow;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "Blue";

    private int getSpeed (){
        return this.speed;
    }
    private void setSpeed(int speed){
        this.speed = speed;
    }

    private double getRadius (){
        return this.radius;
    }
    private void setRadius(int radius){
        this.radius = radius;
    }

    private String getColor(){
        return this.color;
    }
    private void setColor(String color){
        this.color = color;
    }

    private boolean getIsOn(){
        return this.isOn;
    }
    private void setStatus(){
        this.isOn = !this.isOn;
    }

    public static void main(String[] args) {
        XayDungLopFan fan1 = new XayDungLopFan();
        fan1.setStatus();
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        System.out.println("Fan1 has status on, speed "+fan1.getSpeed()+" radius: "+fan1.getRadius()+" and color: "+ fan1.getColor());

        XayDungLopFan fan2= new XayDungLopFan();
        fan2.setSpeed(fan2.medium);
        System.out.println("Fan2 has status off, speed "+fan2.getSpeed()+" radius: "+fan2.getRadius()+" and color: "+ fan2.getColor());


    }



}
