package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= number ; i++) {
            int sumDigits = 0;
            int initialNum = i;
            while (initialNum > 0) {

                sumDigits += initialNum % 10;
                initialNum = initialNum / 10;
            }


            if (sumDigits == 5 || sumDigits == 7 || sumDigits == 11) {
                System.out.printf("%d -> True", i);
                System.out.println();
            } else {
                System.out.printf("%d -> False", i);
                System.out.println();
            }
        }
    }
}

