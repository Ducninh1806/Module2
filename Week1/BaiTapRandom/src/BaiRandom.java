import java.util.Random;

public class BaiRandom {
    public static void main(String[] args) {
        Random input = new Random();
        int x;
        for (int i=0;i<10;i++){
            x =input.nextInt(71)+10;
            System.out.println("X = "+x);
        }
    }
}
