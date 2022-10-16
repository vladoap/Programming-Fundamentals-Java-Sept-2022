package Methods.Exercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= num; i++) {
           if (isSumOfDigitsDivisibleBy8(i) && isAtLeastOneDigitOdd(i)) {
               System.out.println(i);
           }
        }

    }

    public static boolean isSumOfDigitsDivisibleBy8(int n) {
        int sumDigits = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sumDigits += lastDigit;
            n = n / 10;
        }
        if (sumDigits % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isAtLeastOneDigitOdd(int n) {
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                n = n / 10;
            }
        }
        return false;
    }
}
