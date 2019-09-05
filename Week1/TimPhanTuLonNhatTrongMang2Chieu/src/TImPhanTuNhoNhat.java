public class TImPhanTuNhoNhat {
    public static void main(String[] args) {
        int[][] mylist = new int[10][10];
        for (int i=0;i<mylist.length;i++){
            for (int j=0;j<mylist[i].length;j++){
                mylist[i][j]= (int)(Math.random()*100+1);
            }
        }
        for (int i=0;i<mylist.length;i++){
            for (int j=0;j<mylist[i].length;j++){
                System.out.print(mylist[i][j]+ " ");;
            }
            System.out.println();
        }

        System.out.println("Min Value in array is: "+ min(mylist));
    }
    public static int min(int[][] array){
        int min = array[0][0];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                if (min>array[i][j]){
                    min= array[i][j];
                }
            }
        }
        return min;
    }
}
