import javax.swing.*;
import java.util.Scanner;

public class Cau8 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter your number");
        int num = in.nextInt();

        for (int i=1; i<=num; i++){
            if (num%i!=0){
                continue;
            }
            System.out.println(i);
        }








    }
}
