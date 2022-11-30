package regularExpressions.exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> demons = Arrays.stream(scanner.nextLine().split("[, ]+"))
                .collect(Collectors.toList());

        String healthRegex = "([^\\d+\\-*.\\/])";

        String damageRegex = "(-?\\d+\\.?\\d*)";

        String operationRegex = "([*/])";

        Pattern healthPattern = Pattern.compile(healthRegex);

        Pattern damagePattern = Pattern.compile(damageRegex);

        Pattern operationPattern = Pattern.compile(operationRegex);

        for (String demon : demons) {
            Matcher matcher = healthPattern.matcher(demon);

            int health = 0;

            while (matcher.find()) {
                health += matcher.group().charAt(0);
            }

            matcher = damagePattern.matcher(demon);

            double damage = 0;

            while (matcher.find()) {
                damage += Double.parseDouble(matcher.group());
            }

            matcher = operationPattern.matcher(demon);

            while (matcher.find()) {
                if(matcher.group(1).equals("*")) {
                    damage *= 2;
                } else {
                    damage /= 2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n",
                    demon, health, damage);
        }
    }
}