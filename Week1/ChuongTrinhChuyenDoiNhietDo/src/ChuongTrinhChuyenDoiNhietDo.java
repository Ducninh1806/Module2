import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 /5)*celsius+32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0/9)*(fahrenheit-32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Celsius To Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("0. Exit");
            choice= input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Celsius: ");
                    celsius = input.nextInt();
                    System.out.println("Celsius To Fahrenheit: "+ celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.println("Enter Fahrenheit: ");
                    fahrenheit = input.nextInt();
                    System.out.println("Fahrenheit To Celsius: "+ fahrenheitToCelsius(fahrenheit));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }

}
