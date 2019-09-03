import javax.swing.*;

public class PhuongThuc {

    // Kiểm tra tổng của các số nguyên từ 1-10, 20-27,35-49
//    public static void main(String[] args) {
//        int sum= 0;
//        for (int i=1;i<=10;i++){
//            sum +=i;
//            System.out.println("Sum from 1 to 10 is: "+ sum);
//        }
//        sum=0;
//        for (int i=20;i<=37;i++){
//            sum +=i;
//            System.out.println("Sum form 20 to 37 is: "+ sum);
//        }
//        sum =0;
//        for (int i=35;i<=49;i++){
//            sum +=i;
//            System.out.println("Sum form 35 to 49 is: "+ sum);
//        }
//
//    }

    // Tính tổng của các số nguyên từ 1-10, 20-27,35-49 theo phương thức
//    public static void main(String[] args) {
//        System.out.println("Sum form 1 to 10 is: "+ sum(1,10));
//        System.out.println("Sum form 20 to 37 is: "+ sum(20,37));
//        System.out.println("Sum form 35 to 49 is: "+ sum(35,49));
//    }
//    public static int sum(int i1,int i2){
//        int result =0;
//        for (int i= i1; i<= i2;i++){
//            result += i;
//        }return  result;
//    }

    static void mylist(){
        int[] arr= new int[10];
        for (int i=0; i<10;i++){
            arr[i]=(int)(Math.random()*100);
            System.out.println("Value in the Array is: "+ arr[i]);
        }
    }

    static void min(int arr[]){
        int min = arr[0];
        for (int i=1; i<arr.length;i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
         mylist();

        PhuongThuc.min(PhuongThuc.mylist());

    }
}
