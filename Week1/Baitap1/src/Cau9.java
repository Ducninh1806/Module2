import java.util.Scanner;

public class Cau9 {

    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        System.out.println("Enter your number");
        int num = inp.nextInt();
        int x;
        int sum=0;
        while (num>0){
            x= num%10;
            num/=10;
                sum+=x;
        }
        System.out.println("sum = "+sum);










    }
}
