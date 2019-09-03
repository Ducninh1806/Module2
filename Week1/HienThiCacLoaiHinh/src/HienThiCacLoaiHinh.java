import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {

        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("What do you want print the type shape??");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        switch (num){
            case 1:
                for (int i=0; i<3;i++){
                    System.out.println("**********");

                } break;
            case 2:
                for (int i=1;i<6;i++){
                    for (int j=0;j<i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 3:
                for (int i=7;i>=1;i--){

                    for (int j=1;j<i;j++){
                        System.out.print("* ");
                    }System.out.println();

                }break;
        }


    }
}
