package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P05PartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startNum = Integer.parseInt(scan.nextLine());
        int endNum = Integer.parseInt(scan.nextLine());

        for (int i = startNum; i <= endNum; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");
        }

    }
}
