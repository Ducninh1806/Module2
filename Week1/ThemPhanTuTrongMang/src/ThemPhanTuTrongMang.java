import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuTrongMang {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 , 0, 0, 0, 0};
        int[] newarr= new int[12];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your value");
        int number = input.nextInt();
        int indexdel= Arrays.binarySearch(arr,number);
        System.out.println(indexdel);
        if (indexdel<0){
            System.out.println("No value need deletel");
        }else {
            for (int i = 0; i <arr.length ; i++) {
                if (i==arr.length-1){
                    arr[i]=0;
                }else if (i>= indexdel){
                    arr[i]=arr[i+1];
                }
            }
            System.out.println("Array deletel value you want");
            System.out.println(Arrays.toString(arr));

        }

    }
}
