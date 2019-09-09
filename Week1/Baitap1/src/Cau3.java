import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height");
        int height = input.nextInt();
        int x,output;

        for (int i=1; i<= height; i++) {
            for (int j = 0; j <= 2 * height; j++) {
                x = j - height;
                if (x < 0) {
                    x *= -1;
                }
                output = i - x;
                if (output > 0) {
                    System.out.print(output);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
