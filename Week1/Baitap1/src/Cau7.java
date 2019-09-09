import java.util.Scanner;

public class Cau7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        float sum=0;

        for (int i=1;i<=num;i++){
            sum +=1*1.0/i;
        }
        System.out.println(sum);
    }
}
