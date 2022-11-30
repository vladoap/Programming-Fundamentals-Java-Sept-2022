package regularExpressions.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String regex = "\\+359([- ])2\\1[0-9]{3}\\1[0-9]{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> validPhoneNumbers = new ArrayList<>();
        while (matcher.find()) {
            String phoneNumber = matcher.group();
            validPhoneNumbers.add(phoneNumber);
        }

        System.out.println(String.join(", ", validPhoneNumbers));
    }
}
