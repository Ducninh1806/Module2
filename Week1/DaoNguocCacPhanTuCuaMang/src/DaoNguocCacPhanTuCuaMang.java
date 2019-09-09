import java.util.Arrays;
import java.util.Random;

public class DaoNguocCacPhanTuCuaMang {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int [20];
        int[] newArray = new int[20];

        for (int i = 0; i < array.length ; i++) {
            array[i]= random.nextInt(61)+10;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Sau khi dao nguoc");
        for (int i = 0; i <array.length ; i++) {
            newArray[newArray.length-1-i]=array[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
