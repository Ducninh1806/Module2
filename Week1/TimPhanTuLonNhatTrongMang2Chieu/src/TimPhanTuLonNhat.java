import javax.swing.*;
import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        int[][] array= new int[10][10];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j]=(int)(Math.random()*100+1);
            }
        }
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }

        int max = array[0][0];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                if (max<array[i][j]){
                    max= array[i][j];
                }
            }
        }
        System.out.println("MaxValue in array is: "+ max);



    }

}
