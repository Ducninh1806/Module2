import java.util.Arrays;
import java.util.Scanner;

public class PhuongThuc {
    public static int[] nhapmang(int x, Scanner scanner){
        int[] arr= new int[x];
        for (int i = 0; i < x ; i++) {
            arr[i]= scanner.nextInt();
        }
        return arr;
    }

    public static int maxValue(int[] arr){
        int max= arr[0];
        for (int i = 0; i <arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }return max;
    }

    public static String[] TachTuTrongXauChuoi(String arr){
        String[] result = arr.split(" ");
        return result;
    };

    public static void showArrResult(int[ ] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1,arr2,arr3;
        int n1=10,n2=6,n3=5;
        Scanner scanner = new Scanner(System.in);

        String chuoi = "Mot ngay tuoi dep qua di ma";
        System.out.println(Arrays.toString(TachTuTrongXauChuoi(chuoi)));

        arr1= nhapmang(n1,scanner);
        System.out.println(Arrays.toString(arr1));
        int max1= maxValue(arr1);
        System.out.println(max1);

        arr2= nhapmang(n2,scanner);
        System.out.println(Arrays.toString(arr2));
        arr3= nhapmang(n3,scanner);
        System.out.println(Arrays.toString(arr3));    }
}
