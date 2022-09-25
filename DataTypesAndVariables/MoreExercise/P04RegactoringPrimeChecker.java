package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P04RegactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());
        for (int number = 2; number <= N; number++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", number, isPrime);
        }

    }
}
