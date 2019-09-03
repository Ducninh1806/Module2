    import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int a,b;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a: ");
        a = input.nextInt();

        System.out.println("Enter b: ");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        System.out.println("Greatest common factor: "+ a);


    }
}
