import java.util.Scanner;

public class Kiemtranamnhuan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");

        int number = input.nextInt();
        boolean check = false;
        if (number % 4 ==0 ){
            if (number %100 ==0){
                if (number %400== 0){
                    check = true;
                }
            } else{
                check =true;
            }
        }

        if (check){
            System.out.printf("%d is a leap year",number);
        } else {
            System.out.printf("%d is not a leap year", number);
        }
    }
}
