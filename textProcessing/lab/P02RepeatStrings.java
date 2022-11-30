package textProcessing.lab;

import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] textArr = scan.nextLine().split(" ");
        StringBuilder resultText = new StringBuilder();
        for (String currentWord : textArr) {
            int currentLength = currentWord.length();

            for (int i = 1; i <= currentLength; i++) {
                resultText.append(currentWord);
            }
        }

        System.out.println(resultText);
    }
}
