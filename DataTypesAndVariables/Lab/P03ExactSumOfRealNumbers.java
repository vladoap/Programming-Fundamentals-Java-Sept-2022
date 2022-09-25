package DataTypesAndVariables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigDecimal number = new BigDecimal(0);

        int countNumbers = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= countNumbers ; i++) {

       number = number.add(new BigDecimal(scan.nextLine()));

        }
        System.out.println(number);

    }
}
