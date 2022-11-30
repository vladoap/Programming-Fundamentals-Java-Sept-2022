package regularExpressions.moreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04SantaSecretHelper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int key = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        String regex = "@(?<name>[A-Z][a-z]+)[^@\\-!:>]+!(?<behavior>[NG])!";
        Pattern pattern = Pattern.compile(regex);

        while (!input.equals("end")) {
            StringBuilder decryptedText = new StringBuilder();
            for (char symbol : input.toCharArray()) {
                char newSymbol = (char) (symbol - key);
                decryptedText.append(newSymbol);
            }

            Matcher matcher = pattern.matcher(decryptedText);
            if (matcher.find()) {
                String name = matcher.group("name");
                String behavior = matcher.group("behavior");
                if (behavior.equals("G")) {
                    System.out.println(name);
                }



            }




            input = scan.nextLine();
        }

    }
}
