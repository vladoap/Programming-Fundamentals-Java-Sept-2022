package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
int counter = 0;
int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                counter++;
                sum += i;
            }
            if (counter >= number) {
                System.out.printf("Sum: %d", sum);
                break;
            }

        }
    }
}
