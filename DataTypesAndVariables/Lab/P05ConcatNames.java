package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P05ConcatNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        String sign = scan.nextLine();

        System.out.println(String.format("%s%s%s", firstName, sign, lastName));
    }
}
