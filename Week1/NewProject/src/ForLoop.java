import javax.swing.plaf.synth.SynthMenuBarUI;
import java.util.Scanner;

public interface ForLoop {

    public static void main(String[] args) {
        float sum =0;
        int subjects =10;

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter  the marks for "+ subjects+ " subjects");

        for (int count=0; count < subjects; count++){
            float mark;
            mark = scanner.nextFloat();
            sum+=mark;
        }

        System.out.println(" Average mark = "+ sum/subjects);

    }
}
