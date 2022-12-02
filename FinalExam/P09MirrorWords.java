package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P09MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "([@|#])(?<wordOne>[A-Za-z]{3,})\\1\\1(?<wordTwo>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int countMatches = 0;
        List<String> mirrorWords = new ArrayList<>();
        while (matcher.find()) {
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");
            String reversedWordTwo = "";
            for (int i = wordTwo.length() - 1; i >= 0 ; i--) {
                reversedWordTwo += wordTwo.charAt(i);
            }
            if (wordOne.equals(reversedWordTwo)) {
                mirrorWords.add(wordOne + " <=> " + wordTwo);
            }

            countMatches++;
        }

        if (countMatches == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", countMatches);
        }

        if (mirrorWords.size() == 0) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", mirrorWords));
        }

    }
}
