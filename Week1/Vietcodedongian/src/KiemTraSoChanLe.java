import java.util.Scanner;

public class KiemTraSoChanLe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Nhập 1 số: ");
        int number = input.nextInt();

        if (number%2==0){
            System.out.printf("%d là số chẵn",number);
        } else {
            System.out.printf("%d là số lẻ", number);
        }


    }
}
