import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Time move ");
        System.out.println("1. Start");
        System.out.println("2. Stops");
        System.out.println("0. Exit");
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = input.nextInt();
        StopWatch sw= new StopWatch();

        if (number==1){
            sw.start();
            System.out.println(sw.getStartTimes());
        }
        if (number==2){
            sw.stop();
            System.out.println(sw.getEndTimes());
            sw.getElapseTime();
        }
    }
}
