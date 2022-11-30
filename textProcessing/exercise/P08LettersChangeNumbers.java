package textProcessing.exercise;

import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputArr = scan.nextLine().split("\\s+");
        double sum = 0;
        for (String str : inputArr) {
            char firstLetter = str.charAt(0);
            char lastLetter = str.charAt(str.length() - 1);
            double num = Double.parseDouble(str.replace(firstLetter, ' ')
                    .replace(lastLetter, ' ')
                    .trim());

           if (Character.isUpperCase(firstLetter)) {
               num /= firstLetter - 64;
           } else if (Character.isLowerCase(firstLetter)) {
               num *= firstLetter - 96;
           }

            if (Character.isUpperCase(lastLetter)) {
                num -= lastLetter - 64;
            } else if (Character.isLowerCase(lastLetter)) {
                num += lastLetter - 96;
            }

            sum += num;
        }
        System.out.printf("%.2f", sum);
    }
}
