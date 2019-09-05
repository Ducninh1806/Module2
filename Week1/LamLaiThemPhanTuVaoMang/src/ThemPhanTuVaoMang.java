import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your value in array: ");
        int number = input.nextInt();
        System.out.println("Enter index your want");
        int index = input.nextInt();

        int[] mylist ={6,98,5,6,4,0,0,0,0,0};
        int[] array= new int[11];

        for (int i=0;i<array.length;i++){
            if (i<index){
                array[i]=mylist[i];
            }if (i==index){
                array[i]=number;
            }if (i>index){
                array[i]=mylist[i-1];
            }
        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
