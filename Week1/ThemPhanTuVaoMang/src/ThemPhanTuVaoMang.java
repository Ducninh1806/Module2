import java.util.Scanner;

public class ThemPhanTuVaoMang {

    public static void main(String[] args) {
        int[] array={5,7,6,8,4,6,0,0,0,0};
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Enter a index in array: ");
        int index = input.nextInt();
        int[] newarray= new int[11];

        for (int i=0; i<newarray.length;i++){
            if (i< index){
                newarray[i]=array[i];
            }
            if (i==index){
                newarray[index]=num;
            }
            if (i>index){
                newarray[i]=array[i-1];
            }
        }
        for (int i=0; i<newarray.length;i++){
            System.out.print(newarray[i]+"\t");
        }
    }
}
