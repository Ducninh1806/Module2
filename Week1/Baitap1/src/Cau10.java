import java.util.Scanner;

public class Cau10 {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter your number");
        int num = inp.nextInt();

        for (int i=2; i<num;i++){
            if ( num%i==0){
                int n= num/i;
                for (int j=2;j<n;j++){
                    if (n%j==0){

                    }
                }
            }
        }






    }
}
