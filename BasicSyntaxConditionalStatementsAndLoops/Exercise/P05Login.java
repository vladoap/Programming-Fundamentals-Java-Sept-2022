package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = "";
        int countFailedTypes = 0;

        for (int i = username.length() - 1; i >= 0; i--) {
          String currentChar = username.charAt(i) + "";
          password += currentChar;
        }
        String enteredPassword = scan.nextLine();
        while (!enteredPassword.equals(password)) {
            countFailedTypes++;
            if (countFailedTypes == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scan.nextLine();
        }
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}

