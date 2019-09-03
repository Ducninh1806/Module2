import java.util.Scanner;

public class TinhChiSoCanNangCoThe {
    public static void main(String[] args) {
        float weight, height;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a weight: ");
        weight = input.nextFloat();
        System.out.println("Enter a height");
        height = input.nextFloat();
        float bmi = weight/(float) Math.pow(height,2);

        if (bmi<18.5){
            System.out.println("Underweight");
        }else if (bmi >=18.5 & bmi <25){
            System.out.println("Nomal");
        }else if (bmi >=25 & bmi <30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
