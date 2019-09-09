import java.util.Arrays;
import java.util.Collections;

public class LopArray {
    public static void main(String[] args) {
        Integer [] arr = new Integer[]{ 5, 3, 2, 99, 1, 2, 2, 7, 8, 9};
        String[] names= {"Than" , "Hung", "Vuong" , "Tuan", "Linh", "Long"};
        String res = Arrays.toString(names);
        System.out.println(res);

//        Arrays.sort(arr);
//        Arrays.sort(names);
//       // int index = Arrays.binarySearch(names, "Hoang");
//
//        int index = Arrays.binarySearch(names,3,names.length, "Tuan");
//
//        System.out.println("Sau khi sap xep");
//        System.out.println(Arrays.toString(names));

        String[] name2 = Arrays.copyOf(names,3);

        System.out.println("Names: "+ Arrays.toString(names));

        System.out.println("Name2: "+ Arrays.toString(name2));

        System.out.println("is names equals name2 ? " + Arrays.equals(names,name2) );

        int[] mylist = new int[20];
        Arrays.fill(mylist,99);
        System.out.println(Arrays.toString(mylist));
    }
}
