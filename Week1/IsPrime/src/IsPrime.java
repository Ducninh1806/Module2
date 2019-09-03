import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Is Prime: ");
        int number = scanner.nextInt();

        boolean check = true;
        if (number<2){
            System.out.println((int)(number)+ " is not a prime");
        }
        else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if (check){
            System.out.println(number +" is a prime");
        }else {
            System.out.println(number + " is not a prime");
        }

    }
}
