import javafx.scene.transform.Scale;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        int[] mang= { 2, 5, 6, 7, 8, 0, 0, 0, 0, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Mảng trước khi xóa các phần tử");
        System.out.println(Arrays.toString(mang));

        System.out.println("Nhập giá trị cần xóa");
        int num = input.nextInt();

        int b = Arrays.binarySearch(mang,num);
        if (b<0){
            System.out.println("Trong mảng không có giá trị cần xóa");
        }else {
            for (int i = 0; i < mang.length ; i++) {
                if (i== mang.length-1){
                    mang[i]=0;
                }else if (i>=b){
                    mang[i]=mang[i+1];
                }
            }
        }
        System.out.println("Mảng sau khi xóa phần tử");
        System.out.println(Arrays.toString(mang));
    }
}
