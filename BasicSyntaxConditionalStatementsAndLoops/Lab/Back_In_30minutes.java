package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class Back_In_30minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());



        int resultTime = hours * 60 + minutes + 30;
        int clcHours = resultTime / 60;
        int clcMinutes = resultTime % 60;

        if (clcHours >= 24) {
            clcHours = 0;
        }



        System.out.printf("%d:%02d", clcHours, clcMinutes);

    }
}
