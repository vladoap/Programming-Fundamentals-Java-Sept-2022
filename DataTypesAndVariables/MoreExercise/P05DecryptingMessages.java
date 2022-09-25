package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P05DecryptingMessages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int key = Integer.parseInt(scan.nextLine());
        int countLines = Integer.parseInt(scan.nextLine());
        String result = "";
        for (int i = 1; i <= countLines ; i++) {
            char currentSymbol = scan.nextLine().charAt(0);
            result += (char) ((int) currentSymbol + key);
        }
        System.out.println(result);
    }
}
