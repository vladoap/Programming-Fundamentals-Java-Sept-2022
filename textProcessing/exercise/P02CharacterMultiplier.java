package textProcessing.exercise;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] inputArr = scan.nextLine().split(" ");
        int sum = sumCharCodes(inputArr[0], inputArr[1]);
        System.out.println(sum);

    }

    public static int sumCharCodes(String str1, String str2) {
        String longString = null;
        int minLength = Math.min(str1.length(), str2.length());
        int maxLength = Math.max(str1.length(), str2.length());

        if (str1.length() > str2.length()) {
            longString = str1;
        } else if (str2.length() > str1.length()) {
            longString = str2;
        }

        int totalSum = 0;
        for (int i = 0; i < minLength ; i++) {
            totalSum += str1.charAt(i) * str2.charAt(i);
        }

        int leftSum = 0;
        if (longString != null) {
            for (int i = minLength; i < maxLength  ; i++) {

                leftSum += longString.charAt(i);
            }

        }

      return totalSum + leftSum;

    }
}
