package Methods.MoreExercise;

import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dataType = scan.nextLine();
        String input = scan.nextLine();

        switch (dataType) {
            case "int":
                int numInteger = Integer.parseInt(input);
                System.out.println(calculateInput(numInteger));
                break;
            case "real":
                double numDouble = Double.parseDouble(input);
                System.out.printf("%.2f", calculateInput(numDouble));
                break;
            case "string":
                System.out.println(calculateInput(input));
                break;
        }
    }
    public static int calculateInput(int n) {
        return n * 2;
    }
    public static double calculateInput(double n) {
        return n * 1.5;
    }
    public static String calculateInput(String string) {
        return '$'+ string + '$';
    }
}
