package regularExpressions.moreExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P03PostOffice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lineInput = scan.nextLine();
        String[] inputArr = lineInput.split("\\|");

        String regexCapitalLetters = "([#$%*&])(?<letters>[A-Z]+)\\1";
        String regexLettersLength = "[0-9]+:[0-9]{2}";

        Pattern patternCapitalLetters = Pattern.compile(regexCapitalLetters);
        Pattern patternLettersLength = Pattern.compile(regexLettersLength);

        List<String> listWords = Arrays.stream(inputArr[2].split("\\s+")).collect(Collectors.toList());
        List<Character> capitalLetters = new ArrayList<>();

        Matcher matcher = patternCapitalLetters.matcher(inputArr[0]);
        if (matcher.find()) {
            String resultLetters = matcher.group("letters");
            for (char symbol : resultLetters.toCharArray()) {
                capitalLetters.add(symbol);
            }
        }

        Map<Character, Integer> mapWordsLength = new LinkedHashMap<>();
        matcher = patternLettersLength.matcher(inputArr[1]);

        capitalLetters.forEach(letter -> {
            if (!mapWordsLength.containsKey(letter)) {
                mapWordsLength.put(letter, 0);
            }
        });
        while (matcher.find()) {
            String[] currentMatch = matcher.group().split(":");
            int letterCode = Integer.parseInt(currentMatch[0]);
            char symbol = (char) letterCode;
            int length;
            if (currentMatch[1].charAt(0) == '0') {
                length = Integer.parseInt(currentMatch[1].charAt(1) + "");
            } else {
                length = Integer.parseInt(currentMatch[1]);
            }

            if (mapWordsLength.containsKey(symbol)) {
                mapWordsLength.put(symbol, length);
            }
        }

        for (Map.Entry<Character, Integer> entry : mapWordsLength.entrySet()) {
            for (String word : listWords) {
                if (word.charAt(0) == entry.getKey()) {
                    if (word.length() == entry.getValue() + 1) {
                        System.out.println(word);
                    }
                }
            }

        }


    }
}
