package Methods.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        int result = getMultipleOfEvenAndOdds(number);
        System.out.println(result);

    }
    public static int getMultipleOfEvenAndOdds(int num) {
        int sumOdds = 0;
        int sumEvens = 0;
        int absoluteValueNum = Math.abs(num);
        while (absoluteValueNum > 0) {
            int currDigit = (absoluteValueNum % 10);
            if (currDigit % 2 == 0) {
                sumEvens += currDigit;
            } else {
                sumOdds += currDigit;
            }
            absoluteValueNum = absoluteValueNum / 10;
        }
        int result = sumEvens * sumOdds;
        return result;
    }
}
