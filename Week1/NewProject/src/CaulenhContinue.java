import java.util.Scanner;

public class CaulenhContinue {

    public static void main(String[] args) {
        float sum=0;
        int count =0, subject =3;
        Scanner     input = new Scanner(System.in);
        System.out.println("Enter the mark for: "+ subject+ "subjects");
        while (count<subject){
            System.out.println("#" + (count+1) + ":");
            float mark = input.nextFloat();

            if (mark<0){
                System.out.println(mark + "ignored");
                continue;
            }
            sum+=mark;
            count++;

        }
        System.out.println("Average mark: "+ sum/subject);

    }
}
