package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n  ; i++) {
            for (int j = 1; j <= n ; j++) {
                for (int k = 1; k <= n ; k++) {

                    System.out.print((char) ('a' + i -1));
                    System.out.print((char) ('a' + j -1));
                    System.out.print((char) ('a' + k -1));
                    System.out.println();
                }
            }
        }
    }
}
