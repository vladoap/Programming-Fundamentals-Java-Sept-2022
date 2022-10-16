package Methods.Exercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        double result = (findFactorial(num1) * 1.00) / findFactorial(num2);
        System.out.printf("%.2f", result);

    }
    public static long findFactorial(int num) {
        long result = 1;
        for (int i = 1; i <= num ; i++) {
            result = result * i;
        }
        return result;
    }
}
