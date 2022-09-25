package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P02_2FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= lines; i++) {
            double num1 = Double.parseDouble(scan.next());
            double num2 = Double.parseDouble(scan.next());


            double initialNum1 = num1;
            double initialNum2 = num2;
            num1 = Math.abs(num1);
            num2 = Math.abs(num2);

            // сума на цифри на първо число
            int sumNumberOfNum1 = 0;
            while (num1 > 0) {
                double currentDigit = num1 % 10;
                sumNumberOfNum1 += currentDigit;
                num1 = num1 / 10;
            }
            // сума на цифри на второ число
            int sumNumberOfNum2 = 0;
            while (num2 > 0) {
                double currentDigit = num2 % 10;
                sumNumberOfNum2 += currentDigit;
                num2 = num2 / 10;
            }

            if (initialNum1 > initialNum2) {
                System.out.println(sumNumberOfNum1);
            } else {
                System.out.println(sumNumberOfNum2);
            }

        }


    }
}

