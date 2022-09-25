package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int sumDigits = 0;

        while (number > 0) {
            sumDigits += number % 10;
            number = number / 10;
        }
        System.out.println(sumDigits);
    }
}
