package regularExpressions.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05NetherRealms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] demonsList = input.split(",\\s*");


        for (String demon : demonsList) {
            String currentDemon = demon.replaceAll("\\s+", "");
            int health = getHealth(currentDemon);
            Double damage = getDamage(currentDemon);
            System.out.printf("%s - %d health, %.2f damage%n", currentDemon, health, damage);
        }


    }

    private static Double getDamage(String demon) {
       String regexDigits = "(-?\\d+\\.?\\d*)";
       Pattern patternDigits = Pattern.compile(regexDigits);
       String regexSymbols = "([*/])";
       Pattern patternSymbols = Pattern.compile(regexSymbols);
       Matcher matcherSymbols = patternSymbols.matcher(demon);
       Matcher matcherDigits = patternDigits.matcher(demon);
       double sum  = 0;
       while (matcherDigits.find()) {
           sum += Double.parseDouble(matcherDigits.group());
       }
       while (matcherSymbols.find()) {
           if (matcherSymbols.group().equals("*")) {
               sum *= 2;
           } else {
               sum /= 2;
           }

       }


     return sum;

    }

    private static Integer getHealth(String demon) {
        String regexLetters = "([^\\d+\\-*.\\/])";
        Pattern patternLetters = Pattern.compile(regexLetters);
        Matcher matcher = patternLetters.matcher(demon);
          int health = 0;
          while (matcher.find()) {

              health += matcher.group().charAt(0);

          }
        return health;
    }
}
