package regularExpressions.exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> participantsList = Arrays
                .stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());

        Map<String, Integer> participantsMap = new LinkedHashMap<>();
        participantsList.forEach(player -> participantsMap.put(player, 0));
        String regexLetters = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexLetters);
        String regexDigits = "[0-9]";
        Pattern patternDigits = Pattern.compile(regexDigits);

        String input = scan.nextLine();

        while (!input.equals("end of race")) {
            Matcher matcherLetters = patternLetters.matcher(input);
            Matcher matcherDigits = patternDigits.matcher(input);
            StringBuilder name = new StringBuilder();
            while (matcherLetters.find()) {
                name.append(matcherLetters.group());
            }
            String namePlayer = name.toString();
            int sumDigits = 0;
            while (matcherDigits.find()) {
                sumDigits += Integer.parseInt(matcherDigits.group());
            }

           if (participantsMap.containsKey(namePlayer)) {
               int currentDistance = participantsMap.get(namePlayer);
               participantsMap.put(namePlayer, sumDigits + currentDistance);
           }

            input = scan.nextLine();
        }

        List<String> resultNames = participantsMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("1st place: " + resultNames.get(0));
        System.out.println("2nd place: " + resultNames.get(1));
        System.out.println("3rd place: " + resultNames.get(2));


    }
}
