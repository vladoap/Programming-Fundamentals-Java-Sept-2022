package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());

        double result = powerNumber(number,power);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));


    }

    public static double powerNumber(double number, int power) {
        double result = 1;
        for (int i = 1; i <= power ; i++) {
            result = result * number;
        }
        return result;
    }
}
