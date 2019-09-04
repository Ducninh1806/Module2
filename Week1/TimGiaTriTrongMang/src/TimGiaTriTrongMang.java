import java.util.Scanner;

public class TimGiaTriTrongMang {

    public static void main(String[] args) {
        String[] student = {"Christian", "Michael", "Camila", "Emily", "Sienna", "Enna", "Zoe"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String input_name = input.nextLine();
        boolean isExist= false;
        for (int i=0;i<student.length;i++){
            if (student[i].equals(input_name)){
                int index = i;
                System.out.println("This name's: "+ student[i]+" in position "+ index);
                isExist=true;
                break;
            }
        }
        if (!isExist)   {
            System.out.println("Not found"+ input_name +"in the list" );
        }
    }
}
