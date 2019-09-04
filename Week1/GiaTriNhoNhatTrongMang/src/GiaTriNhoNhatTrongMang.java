public class GiaTriNhoNhatTrongMang {

    public static int min(int[] array){
        int min = array[0];
        int a=0;
        for (int i=1;i<array.length;i++){
            if (min > array[i]){
                min= array[i];
                a=i;
            }
        } return a;
    }

    public static void main(String[] args) {
        int[] myLish= new int[10];
        for (int i=0;i<myLish.length;i++){
            myLish[i]= (int)(Math.random()*100+1);
            System.out.println("myLish have Index "+ i+ " have value: "+ myLish[i] );
        }
        int index = min(myLish);
        System.out.println("Min value in mylish is "+myLish[index] + " in position "+ index );
    }
}
