import java.util.Scanner;

class PhuongTrinh{
    public float a,b,c;
    double x1,x2;
    double delta;

    Scanner input = new Scanner(System.in);
    public void nhap(){
        System.out.println("Enter a");
        a = input.nextFloat();
        System.out.println("Enter b");
        b = input.nextFloat();
        System.out.println("Enter c");
        c = input.nextFloat();
    }
    public double tinhDelta(){

        delta = Math.pow(b,2)-4*a*c;
        return delta;
    }

    public double nghiemduynhat(){
        x1 = -c/b;
        return x1;
    }
    public double nghiemkep(){
        x1= -b/(2*a);
        return x1;
    }
    public void nghiemphanbiet(){
        x1= (-b+Math.sqrt(delta))/(2*a);
        x2= (-b-Math.sqrt(delta))/(2*a);
        System.out.println("x1= "+x1);
        System.out.println("x2= "+x2);
    }
}
class dieukien{

    PhuongTrinh pt = new PhuongTrinh();
    public void nhappt(){
        pt.nhap();
    }
    public void kiemtra(){
        if (pt.a==0){
            if (pt.b==0){
                System.out.println("Phương trình vô số nghiệm");
            }else {
                System.out.println("Phương trình có nghiệm duy nhất "+ pt.nghiemduynhat());
            }
        }else {
            if (pt.tinhDelta()<0){
                System.out.println("Phương trình vô nghiệm");
            }else {
                if (pt.tinhDelta()==0){
                    System.out.println("Phương trình có nghiệm kép: "+ pt.nghiemkep());
                }else {
                    System.out.println("Phương trình có 2 nghiệm phân biệt: ");
                    pt.nghiemphanbiet();
                }
            }
        }
    }
}

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        dieukien dk =new dieukien();
        dk.nhappt();
        dk.kiemtra();
    }





}