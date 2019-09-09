import java.lang.reflect.Array;
import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = { 34,5,7,9,0,76,54,3,324};
        int[] arr2 = {12,43,65,76,87,98,7,54};
        int[] arr3 = new int[17];
        for (int i = 0; i <arr1.length ; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i+9]= arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
