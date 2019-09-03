import java.util.Scanner;

public class TongGiaiThua {
    public static void main(String[] args) {

        Scanner nhap = new Scanner(System.in);
        System.out.print("Giai thừa của ");
        int num = nhap.nextInt();
        double sum=1;

        System.out.print(1);
        for (int i=2; i<=num;i++){
            System.out.print( "*"+i );
            sum *= i;
        }
        System.out.println("=" +sum);
    }
}