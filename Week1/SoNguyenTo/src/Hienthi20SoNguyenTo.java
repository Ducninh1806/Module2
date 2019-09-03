import java.util.Scanner;

public class Hienthi20SoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào số nguyên number= ");
        int number = input.nextInt();
        System.out.println("Các số nguyên nhỏ hơn number là: ");
        int count =0, i,n;

        for (i=2;i<=n;i++){
            if (nguyento(i)==1){
                System.out.print(i + " ");
            }
        }
    }
}
