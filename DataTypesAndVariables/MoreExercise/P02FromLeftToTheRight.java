package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= lines; i++) {
            String input = scan.nextLine();
            String num1 = "";
            String num2 = "";
            boolean firstNumberFound = false;
            for (int j = 0; j < input.length() - 1; j++) {
                if (input.charAt(j) == 32) {
                    firstNumberFound = true;
                }
                if (!firstNumberFound) {
                    num1 += input.charAt(j);
                } else {
                    num2 += input.charAt(j + 1);
                }
                }
            double intNum1 = Double.parseDouble(num1);
            double intNum2 = Double.parseDouble(num2);


            double clcNum1 = Math.abs(intNum1);
            double clcNum2 = Math.abs(intNum2);
            // сума на цифри на първо число
            int sumNumberOfNum1 = 0;
            while (clcNum1 > 0) {
                double currentDigit = clcNum1 % 10;
                sumNumberOfNum1 += currentDigit;
                clcNum1 = clcNum1 / 10;
            }
            // сума на цифри на второ число
            int sumNumberOfNum2 = 0;
            while (clcNum2 > 0) {
                double currentDigit = clcNum2 % 10;
                sumNumberOfNum2 += currentDigit;
                clcNum2 = clcNum2 / 10;
            }

            if (intNum1 > intNum2) {
                System.out.println(sumNumberOfNum1);
            } else {
                System.out.println(sumNumberOfNum2);
            }

            }


        }
    }
