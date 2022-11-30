package regularExpressions.moreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02RageQuit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        input = input.toUpperCase();

        String regex = "[0-9]{1,2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();
        List<String> uniqueSymbolsList = new ArrayList<>();

        int lastIndex = 0;
        while (matcher.find()) {
            int repeatTimes = Integer.parseInt(matcher.group());
            int currentIndex = input.indexOf(matcher.group(), lastIndex);
            String currentText = input.substring(lastIndex, currentIndex);
            for (char symbol : currentText.toCharArray()) {
                String currentSymbol = symbol + "";
                if (!uniqueSymbolsList.contains(currentSymbol)) {
                    uniqueSymbolsList.add(currentSymbol);
                }
            }
            for (int i = 0; i < repeatTimes; i++) {
                result.append(currentText);
            }
            if (repeatTimes >= 10) {
                lastIndex = currentIndex + 2;
            } else {

                lastIndex = currentIndex + 1;
            }
        }

        long countChars = result.chars().distinct().count();  // брой символи, които не са повтарят
        System.out.printf("Unique symbols used: %d%n", countChars);
        System.out.println(result.toString());


    }
}
