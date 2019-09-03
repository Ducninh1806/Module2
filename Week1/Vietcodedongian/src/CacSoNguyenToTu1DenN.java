import java.util.Scanner;

public class CacSoNguyenToTu1DenN {

    static boolean isPrime(int x){
        int count =0;
        for (int i=2; i<x;i++) {
            if (x % i == 0)
                count++;
        }
            if (count ==0)
                return true;
            else
                return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập n ");
        int n = in.nextInt();
        for (int i=2; i<n; i++){
            if (isPrime(i))
                System.out.println(i);

        }
    }
    }
