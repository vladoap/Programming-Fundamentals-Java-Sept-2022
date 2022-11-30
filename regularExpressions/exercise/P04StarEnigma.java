package regularExpressions.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String regex = "@(?<name>[A-Za-z]+)([^W\\-!:>]*):(?<population>[0-9]+)([^W\\-!:>]*)!(?<attackType>[AD])!([^W\\-!:>]*)->(?<soldierCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            String input = scan.nextLine();
            String decryptedMessage = getDecryptedMessage(input);
            Matcher matcher = pattern.matcher(decryptedMessage);
            if (matcher.find()) {
                String name = matcher.group("name");
                String attackType = matcher.group("attackType");
                if (attackType.equals("A")) {
                    attackedPlanets.add(name);
                } else if (attackType.equals("D")) {
                    destroyedPlanets.add(name);
                }
            }
        }
        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);

        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        attackedPlanets.forEach(planet -> System.out.println("-> " + planet));
        System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));


    }

    private static String getDecryptedMessage(String text) {
        int countLetters = 0;
        for (char symbol : text.toCharArray()) {
            switch (symbol) {
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    countLetters++;
                    break;
            }
        }
        StringBuilder decryptedText = new StringBuilder();
        for (char symbol : text.toCharArray()) {
            decryptedText.append((char) (symbol - countLetters));
        }

        return decryptedText.toString();
    }
}
