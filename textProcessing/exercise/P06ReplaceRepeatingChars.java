package textProcessing.exercise;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder lineInput = new StringBuilder(scan.nextLine());

        char lastChar = 0;
        for (int i = 0; i < lineInput.length(); i++) {
            char currentChar = lineInput.charAt(i);
            if (currentChar == lastChar) {
                lineInput.deleteCharAt(i);
                i--;
            }

            lastChar = currentChar;
        }

        System.out.println(lineInput);
    }
}
