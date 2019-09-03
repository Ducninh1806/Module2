import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {

        double interest_rate_1 = 5;
        double interest_rate_2 = 7;
        double interest_rate_3 = 9;
        double interest_rate_4 = 10.5;
        double interest_money =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Số tiền bạn gửi: ");
        double money= input.nextDouble();
        System.out.println("Số tháng bạn sẽ gửi");
        int month= input.nextInt();
        if  (month<=3&& month>0){
            System.out.println("Tỉ lệ lãi suất của bạn là: "+ interest_rate_1);
            for (int i=1;i<=month;i++) {
                interest_money = money * interest_rate_1 / 12 * month;
            }
        }else if (month<=6){
            System.out.println("Tỉ lệ lãi suất của bạn là: "+ interest_rate_2);
            for (int i=1;i<=month;i++) {
                interest_money = money * interest_rate_2 / 12 * month;
            }
        }else if (month<=12){
            System.out.println("Tỉ lệ lãi suất của bạn là: "+ interest_rate_3);
            for (int i=1;i<=month;i++) {
                interest_money = money * interest_rate_3 / 12 * month;
            }
        }else{
            System.out.println("Tỉ lệ lãi suất của bạn là: "+ interest_rate_4);
            for (int i=1;i<=month;i++) {
                interest_money = money * interest_rate_4 / 12 * month;
            }
        }

        System.out.println("When do you sent save money for Bank with sent money "+money+" in "+ month + " month "+ "and interest money of you is: "+interest_money );


    }
}
