import javax.swing.*;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        int[] mylist = { 3, 5, 7, 8, 9, 53, 45, 65, 76, 343, 23, 65};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your value :");
        int number = input.nextInt();
        System.out.println("Enter your index change:");
        int index = input.nextInt();

        for (int i=0;i<mylist.length;i++){
            if (i==index){
                Arrays.fill(mylist,index+0,index+1,number);
            }

        }
        System.out.println(Arrays.toString(mylist));
    }
}
