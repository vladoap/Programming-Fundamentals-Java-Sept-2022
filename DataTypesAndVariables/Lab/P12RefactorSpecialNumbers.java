package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= number; i++) {
            boolean checkSum = false;
            int currentDigit = i;
            int sum = 0;
            while (currentDigit > 0) {
                sum += currentDigit % 10;
                currentDigit = currentDigit / 10;
            }
            checkSum = (sum == 5) || (sum == 7) || (sum == 11);
            String result = "";
            if (checkSum) {
                result = "True";
            } else {
                result = "False";
            }
            System.out.printf("%d -> %s%n", i, result);


        }

    }
}
