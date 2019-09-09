import java.util.Arrays;
import java.util.Scanner;

public class DemSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        String chuoi= "Trong doi co it nhat mot lan ban vap nga neu khong tu minh dung len thi se cha ai do ban len ca";
        String[] mangchuoi = chuoi.split(" ");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your string find");
        String viet = input.nextLine();
        int count=0;

        for (int i = 0; i <mangchuoi.length(); i++) {
           if (ben == viet){
               count++;
           }
        }
        System.out.println(count);
    }
}
