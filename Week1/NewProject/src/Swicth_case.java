import java.util.Scanner;

public class Swicth_case {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");

        int number = scanner.nextInt();
        switch (number){
            case 10:
                System.out.println("Excilent");
                break;
            case 9:
            case 8:
                System.out.println("Good");
                break;
            case 7:
            case 6:
                System.out.println("Great");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Bad");
                break;
        }
    }
}
