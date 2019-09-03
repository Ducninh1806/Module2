

import java.util.Scanner;
public class ReadNumberToString {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        String isNumberWord;
        switch (number){
            case 0:
                isNumberWord = "zero";
                break;
            case 1:
                isNumberWord = "one");
                break;
            case 2:
                isNumberWord = "two");
                break;
            case 3:
                isNumberWord = "three");
                break;
            case 4:
                isNumberWord =  "four");
                break;
            case 5:
                isNumberWord =  "five");
                break;
            case 6:
                isNumberWord = "six");
                break;
            case 7:
                isNumberWord = "seven");
                break;
            case 8:
                isNumberWord =  "eight");
                break;
            case 9:
                isNumberWord = "nine");
                break;
            case 10:
                isNumberWord = "tens");
                break;
        }
        System.out.println("The number word '%d' has %s ");
    }



}
