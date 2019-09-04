public class TimGiaTriLonNhatTrongMang {

    static int max(int[] array){
        int max = array[0];
        int index = 0;
        for (int i = 0; i<array.length;i++){
            if (max<array[i]){
                max=array[i];
                index=i;
            }
        } return index;
    }


    public static void main(String[] args) {
        int[] myLish= new int[10];
        for (int i=0; i<myLish.length;i++){
            myLish[i]=(int)(Math.random()*100+1);
            System.out.println("Index "+i+" in myLish "+ myLish[i] );
        }
        int index = max(myLish);
        System.out.println("Max value in myLish "+myLish[index]+ " in position "+index );

//        int max= myLish[0];
//        int index=0;
//        for (int i=1; i< myLish.length;i++){
//            if (max<myLish[i]){
//                max=myLish[i];
//                index = i;
//            }
//        }
//        System.out.println("Value max in myLish is: "+ max+ " in position "+ index);

    }


}
