package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        int times = 1;
        while (times <= 10) {
            System.out.printf("%d X %d = %d%n", num, times, num* times);
            times++;
        }
    }
}
