package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int multiplier = Integer.parseInt(scan.nextLine());

do {
    System.out.printf("%d X %d = %d%n", num, multiplier, num * multiplier);
    multiplier++;
}  while (multiplier <= 10);
    }
}
