package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([#|\\|])(?<name>[A-Za-z\\s]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        StringBuilder sb = new StringBuilder();
        int totalCalories = 0;
        String name = "";
        String expirationDate = "";
        int calories = 0;
        while (matcher.find()) {
            name = matcher.group("name");
            expirationDate = matcher.group("date");
            calories = Integer.parseInt(matcher.group("calories"));
            totalCalories += calories;
           sb.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n", name, expirationDate, calories));
        }

        int totalDays = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", totalDays);
        System.out.println(sb);




    }
}
