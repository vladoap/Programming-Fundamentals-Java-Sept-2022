package textProcessing.lab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] bannedWords = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (String word : bannedWords) {
            int currentWordLength = word.length();
            if (text.contains(word)) {
               text = text.replace(word, replaceWord("*", currentWordLength));
            }
        }

        System.out.println(text);
    }

    private static String replaceWord(String symbol, int currentWordLength) {
        String result = "";
        for (int i = 1; i <= currentWordLength ; i++) {
            result += symbol;
        }

        return result;
    }
}

