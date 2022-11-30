package finalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04TheImitationGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();
        String operation = scan.nextLine();
        StringBuilder sb = new StringBuilder(message);
        while (!operation.equals("Decode")) {
            if (operation.contains("Move")) {
                int index = Integer.parseInt(operation.split("\\|")[1]);
                String subString = sb.substring(0, index);
                sb.delete(0, index);
                sb.append(subString);
            } else if (operation.contains("Insert")) {
                int index = Integer.parseInt(operation.split("\\|")[1]);
                String value = operation.split("\\|")[2];
                sb.insert(index, value);
            } else if (operation.contains("ChangeAll")) {
                String subString = operation.split("\\|")[1];
                String replacement = operation.split("\\|")[2];
                int index = sb.indexOf(subString);
                while (index != -1) {
                    sb.replace(index, index + subString.length(), replacement);
                    index = index + subString.length();
                    index = sb.indexOf(subString, index);
                }
            }

            operation = scan.nextLine();
        }
        System.out.println("The decrypted message is: " + sb.toString());

    }
}
