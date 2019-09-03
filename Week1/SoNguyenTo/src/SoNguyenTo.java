import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        int count=0,i=2;
        Scanner input = new Scanner(System.in);
        System.out.println("Kiem tra so nguyen to");
        int number = input.nextInt();
        boolean check = true;
        for (i=2;i<= Math.sqrt(number);i++){
            if (number%i==0){
                check = false;
            }
            count++;
        }
        if (check){
            System.out.printf("%d la so nguyen to",number);
        } else {
            System.out.printf("%d khong phai la so nguyen to",number);
        }
    }
}
