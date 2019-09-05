import java.util.Scanner;

public class SoNguyenTo1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many do you want prime: ");
        int number = input.nextInt();

        int count=0;
        for (int i=2;;i++){
            if (check(i)){
                count++;
                System.out.println("So Nguyen To thu"+ count + " la "+i);
            }
            if (count==number){
                break;
            }
        }




    }
     public static boolean check(int number){
        boolean check=true;
        if (number<2){
            check=false;

        }else {
            for (int i=2;i<=Math.sqrt(number);i++){
                if (number%i==0){
                    check=false;
                    break;
                }
            }
        }
        return check;
     }
}
