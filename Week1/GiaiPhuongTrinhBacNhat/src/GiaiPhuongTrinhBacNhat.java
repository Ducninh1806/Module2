import java.util.Scanner;
public class GiaiPhuongTrinhBacNhat {

    public static void main(String[] args) {
        System.out.println( "Linear Equation Resolver");
        System.out.println("Given a equation as 'a*x+b=c; please enter constants: ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a= scanner.nextDouble();

        System.out.println("b: ");
        double b= scanner.nextDouble();

        System.out.println("c: ");

        if (a!=0){
            double answer = (c-b)/a;
            System.out.println("Equation pass with x=%f!\n"+answer);
        }else {
            if (b==0){
                System.out.println("The solution is all x!");
            }
            else {
                System.out.println("No solution");
            }
        }
    }
}
