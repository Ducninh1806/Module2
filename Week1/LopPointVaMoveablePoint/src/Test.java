public class Test {
    public static void main(String[] args) {
     Point point= new Point();
     System.out.println(point);

     point= new Point(4,7);
     System.out.println(point);

    MoveablePoint moveablePoint = new MoveablePoint();
    System.out.println(moveablePoint);

    moveablePoint=new MoveablePoint(4,5,6,7);
    System.out.println(moveablePoint);
    System.out.println(moveablePoint.move());

    }
}
