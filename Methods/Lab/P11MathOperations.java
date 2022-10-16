package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        char operator = scan.nextLine().charAt(0);
        int num2 = Integer.parseInt(scan.nextLine());

        double result = (calcNum(num1, num2, operator));
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));

    }
    public static double calcNum(int number1, int number2, char operator) {
        double result = 0;
        switch (operator) {
            case '/':
                result = number1 / number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;

        }
        return result;
    }
}
