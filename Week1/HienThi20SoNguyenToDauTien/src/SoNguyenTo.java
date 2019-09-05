import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many number for your want display: ");
        int number= input.nextInt();
        int count=0;
        for (int i=0;;i++){
            if (check(i)){
                count++;
                System.out.println("So Nguyen To thu "+ count+ " la "+ i);
            }
            if (count==number){
                break;
            }
        }
    }

    public static boolean check (int number){
        boolean soNguyenTo=true;

        if (number<2){
            soNguyenTo= false;
        }
        else {
            int i=2;
            while (i<=Math.sqrt(number)){
                if (number%i==0){
                    soNguyenTo = false;
                    break;
                } i++;
            }

        } return soNguyenTo;
    }
}
