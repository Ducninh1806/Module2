import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height:");
        int height = input.nextInt();
        System.out.println("Enter your width");
        int width = input.nextInt();

        for (int i=1;i<=height;i++) {
            for (int j = 1; j <= width; j++) {
                if (j>1 & j<height & i>1 & i<height){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
