import java.util.Scanner;

public class TongCacBoiSoCua7 {
    public static void main(String[] args) {

        System.out.println("Tổng số bội của 7 từ 1 đến n");
        Scanner input = new Scanner(System.in);
        int sum=0, n, i;
        n = input.nextInt();

        for (i=1;i<=n;i++){
            if (i%7==0 ){
                sum+=i;
            }
        }
        System.out.println("Tổng bội số của 7 từ 1 đến "+ n +" là " +sum);

    }
}
