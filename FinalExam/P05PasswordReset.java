package FinalExam;

import java.util.Scanner;

public class P05PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            if (command.contains("TakeOdd")) {
                String newPassword = getOddIndices(password);
                password = newPassword;
                System.out.println(password);
            } else if (command.contains("Cut")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int length = Integer.parseInt(command.split(" ")[2]);
                String substring = password.substring(index, index + length);
                password = password.replaceFirst(substring, "");
                System.out.println(password);
            } else if (command.contains("Substitute")) {
                String substring = command.split(" ")[1];
                String substitute = command.split(" ")[2];

                if (password.contains(substring)) {
                    password = password.replaceAll(substring, substitute);
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }


            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);

    }

    private static String getOddIndices(String password) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < password.length() ; i+=2) {
            char currentSymbol = password.charAt(i);
            sb.append(currentSymbol);
        }
        return sb.toString();
    }
}
